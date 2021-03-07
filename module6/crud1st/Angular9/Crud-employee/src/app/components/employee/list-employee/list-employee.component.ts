import { EmployeeService } from './../../../services/employee.service';
import { Component, OnInit } from '@angular/core';
import { DeleteEmployeeComponent } from '../delete-employee/delete-employee.component';
import { MatDialog } from '@angular/material/dialog';

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.scss']
})
export class ListEmployeeComponent implements OnInit {
  public employeeList;

  constructor(
    public employeeService: EmployeeService,
    public dialog: MatDialog
  ) { }

  ngOnInit(): void {
    this.employeeService.getAllEmployees().subscribe(data => {
      this.employeeList = data.content;
    })
  }

  openDialog(id): void {
    this.employeeService.getEmployeeById(id).subscribe(result => {
      const dialogRef = this.dialog.open(DeleteEmployeeComponent, {
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
