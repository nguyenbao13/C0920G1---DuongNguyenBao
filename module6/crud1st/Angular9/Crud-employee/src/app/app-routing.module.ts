import { MaterialModule } from './material.module';
import { DeleteEmployeeComponent } from './components/employee/delete-employee/delete-employee.component';
import { ReactiveFormsModule } from '@angular/forms';
import { EditEmployeeComponent } from './components/employee/edit-employee/edit-employee.component';
import { CreateEmployeeComponent } from './components/employee/create-employee/create-employee.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListEmployeeComponent } from './components/employee/list-employee/list-employee.component';
import { CommonModule } from '@angular/common';


const routes: Routes = [
  { path: '', redirectTo: 'employee', pathMatch: 'full' },
  { path: 'employee', component: ListEmployeeComponent },
  { path: 'create-employee', component: CreateEmployeeComponent },
  { path: 'edit-employee/:employeeId', component: EditEmployeeComponent },
  { path: 'delete-employee/:employeeId', component: DeleteEmployeeComponent },
];

@NgModule({
  declarations: [
    ListEmployeeComponent,
    CreateEmployeeComponent,
    EditEmployeeComponent,
    DeleteEmployeeComponent
  ],
  imports: [
    RouterModule.forRoot(routes),
    CommonModule,
    ReactiveFormsModule,
    MaterialModule
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
