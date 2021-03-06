import { EditEmployeeComponent } from './components/employee/edit-employee/edit-employee.component';
import { CreateEmployeeComponent } from './components/employee/create-employee/create-employee.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule, ActivatedRoute } from '@angular/router';
import { ListEmployeeComponent } from './components/employee/list-employee/list-employee.component';
import { CommonModule } from '@angular/common';


const routes: Routes = [
  { path: '', redirectTo: 'employee', pathMatch: 'full' },
  { path: 'employee', component: ListEmployeeComponent },
  { path: 'create-employee', component: CreateEmployeeComponent },
  { path: 'edit-employee/:id', component: EditEmployeeComponent },
];

@NgModule({
  declarations: [
    ListEmployeeComponent,
    CreateEmployeeComponent,
    EditEmployeeComponent
  ],
  imports: [
    RouterModule.forRoot(routes),
    CommonModule,
    ActivatedRoute,
    RouterModule
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
