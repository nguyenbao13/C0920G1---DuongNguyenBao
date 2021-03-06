import { DeleteCustomerComponent } from './../delete-customer/delete-customer.component';
import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { CustomerService } from '../../../services/customer.service'
@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.scss'],
})
export class ListCustomerComponent implements OnInit {
  public customers;
  public p: number = 1; //Pagination
  

  constructor(
    public customerService: CustomerService,
    public dialog: MatDialog
  ) { }

  ngOnInit(): void {
    this.customerService.getAllCustomers().subscribe(data => {
      this.customers = data;
    })
  }

  openDialog(id): void {
    this.customerService.getCustomerById(id).subscribe(result => {
      const dialogRef = this.dialog.open(DeleteCustomerComponent, {
        width: '500px',
        data: {data1: result},
        disableClose: true
      });
  
      dialogRef.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    })
  
  }
}
