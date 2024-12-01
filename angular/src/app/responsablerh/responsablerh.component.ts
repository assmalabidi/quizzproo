import { Component, OnInit } from '@angular/core';
import { ResponsablerhService, Responsablerh } from '../responsablerh.service';

@Component({
  selector: 'app-responsablerh',
  templateUrl: './responsablerh.component.html',
  styleUrls: ['./responsablerh.component.css'],
})
export class ResponsablerhComponent implements OnInit {
  responsables: Responsablerh[] = [];
  isEditMode: boolean = false;
  currentResponsable: Responsablerh = {
    id: 0,
    nom: '',
    prenom: '',
    email: '',
    num: '',
    adresse: '',
    password:'',
    statut: 'ACTIF',
    datenaissance: new Date(),
  };

  constructor(private responsablerhService: ResponsablerhService) {}

  ngOnInit(): void {
    this.fetchResponsables();
  }

  fetchResponsables(): void {
    this.responsablerhService.getResponsables().subscribe(
      (data) => {
        this.responsables = data;
      },
      (error) => {
        console.error('Erreur lors de la récupération des responsables:', error);
      }
    );
  }

  onSubmit(): void {
    // Vérification des champs requis uniquement en mode ajout
    if (!this.isEditMode) {
      const { nom, prenom, email, num, adresse } = this.currentResponsable;
      if (!nom || !prenom || !email || !num || !adresse) {
        console.error('Tous les champs sont obligatoires pour ajouter un nouveau responsable.');
        alert('Veuillez remplir tous les champs pour ajouter un responsable.');
        return;
      }
    }

    if (this.isEditMode) {
      // Modification d'un responsable existant
      this.responsablerhService.updateResponsable(this.currentResponsable.id, this.currentResponsable)
        .subscribe(
          () => {
            this.fetchResponsables();
            this.resetForm();
          },
          (error) => console.error('Erreur lors de la mise à jour du responsable:', error)
        );
    } else {
      // Ajout d'un nouveau responsable
      this.responsablerhService.addResponsable(this.currentResponsable)
        .subscribe(
          () => {
            this.fetchResponsables();
            this.resetForm();
          },
          (error) => console.error('Erreur lors de l\'ajout du responsable:', error)
        );
    }
  }


  editResponsable(responsable: Responsablerh): void {
    this.isEditMode = true;
    this.currentResponsable = { ...responsable };
  }

  deleteResponsable(id: number): void {
    this.responsablerhService.deleteResponsable(id).subscribe(
      () => this.fetchResponsables(),
      (error) => console.error('Erreur lors de la suppression du responsable:', error)
    );
  }

  resetForm(): void {
    this.isEditMode = false;
    this.currentResponsable = {
      id: 0,
      nom: '',
      prenom: '',
      email: '',
      num: '',
      adresse: '',
      password:'',
      statut: 'ACTIF',
      datenaissance: new Date(),
    };
  }
}
