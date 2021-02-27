import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateCustomerComponent } from './components/customer/create-customer/create-customer.component';
import { ListCustomerComponent } from './components/customer/list-customer/list-customer.component';
import { HomePageComponent } from './components/home-page/home-page.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';

const routes: Routes = [
  { path: '', redirectTo: 'home-page', pathMatch: 'full' },
  { path: 'home-page', component: HomePageComponent },
  { path: 'list-customer', component: ListCustomerComponent },
  { path: 'create-customer', component: CreateCustomerComponent },
  { path: '**', component: PageNotFoundComponent },
];

@NgModule({
  declarations: [CreateCustomerComponent, ListCustomerComponent, HomePageComponent, PageNotFoundComponent],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
