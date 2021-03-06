import { MaterialModule } from './material.module';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateCustomerComponent } from './components/customer/create-customer/create-customer.component';
import { ListCustomerComponent } from './components/customer/list-customer/list-customer.component';
import { HomePageComponent } from './components/home-page/home-page.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { NgxPaginationModule } from 'ngx-pagination';
import { EditCustomerComponent } from './components/customer/edit-customer/edit-customer.component';
import { DeleteCustomerComponent } from './components/customer/delete-customer/delete-customer.component';
import { ListSavingBookComponent } from './saving-book/list-saving-book/list-saving-book.component';
import { EditSavingBookComponent } from './saving-book/edit-saving-book/edit-saving-book.component';

const routes: Routes = [
  { path: '', redirectTo: 'home-page', pathMatch: 'full' },
  { path: 'home-page', component: HomePageComponent },
  { path: 'list-customer', component: ListCustomerComponent },
  { path: 'create-customer', component: CreateCustomerComponent },
  { path: 'edit-customer/:id', component: EditCustomerComponent },
  { path: 'list-saving-book', component: ListSavingBookComponent },
  { path: 'edit-saving-book/:id', component: EditSavingBookComponent },
  { path: '**', component: PageNotFoundComponent },
];

@NgModule({
  declarations: [
    CreateCustomerComponent,
    ListCustomerComponent,
    HomePageComponent,
    PageNotFoundComponent,
    EditCustomerComponent,
    DeleteCustomerComponent,
    ListSavingBookComponent,
    EditSavingBookComponent],
  imports: [
    RouterModule.forRoot(routes),
    CommonModule,
    ReactiveFormsModule,
    Ng2SearchPipeModule,
    NgxPaginationModule,
    MaterialModule,
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
