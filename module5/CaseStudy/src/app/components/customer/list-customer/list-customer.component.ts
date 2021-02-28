import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../../../services/customer.service'
@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.scss'],
})
export class ListCustomerComponent implements OnInit {
  public customers;
  p: number = 1; //Pagination

  constructor(
    public customerService: CustomerService
  ) { }

  ngOnInit(): void {
    this.customerService.getAllCustomers().subscribe(data => {
      this.customers = data;
    })
  }

}
