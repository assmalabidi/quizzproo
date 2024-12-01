import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ResponsablerhComponent } from './responsablerh/responsablerh.component';

const routes: Routes = [
  { path: 'responsablerh', component: ResponsablerhComponent },
  { path: '', redirectTo: '/responsablerh', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
