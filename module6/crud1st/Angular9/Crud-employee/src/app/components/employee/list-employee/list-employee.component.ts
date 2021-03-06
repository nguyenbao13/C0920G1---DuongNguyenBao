import { EmployeeService } from './../../../services/employee.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.scss']
})
export class ListEmployeeComponent implements OnInit {
  public employeeList;

  constructor(
    public employeeService: EmployeeService,
  ) { }

  ngOnInit(): void {
    this.employeeService.getAllEmployees().subscribe(haha => {
      console.log(haha)
      this.employeeList = haha.content;
      console.log(this.employeeList)
    })
  }

}
