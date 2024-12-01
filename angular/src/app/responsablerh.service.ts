import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Responsablerh {
  id: number ;
  nom: string;
  prenom: string;
  email: string;
  num: string;
  adresse: string;
  password:string;
  statut: string;
  datenaissance: Date;
}

@Injectable({
  providedIn: 'root', // Fournit automatiquement le service à l'échelle de l'application
})
export class ResponsablerhService {
  private apiUrl = 'http://localhost:8081/ResponsablesRh'; // Exemple d'URL de l'API

  constructor(private http: HttpClient) {}

  getResponsables(): Observable<Responsablerh[]> {
    return this.http.get<Responsablerh[]>(this.apiUrl+'/getAllResponsablerh');
  }

  addResponsable(responsable: Responsablerh): Observable<Responsablerh> {
    return this.http.post<Responsablerh>(this.apiUrl+'/addResponsable', responsable);
  }

  updateResponsable(id: number, responsable: Responsablerh): Observable<Responsablerh> {
    return this.http.put<Responsablerh>(`${this.apiUrl}/${id}`, responsable);
  }

  deleteResponsable(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
