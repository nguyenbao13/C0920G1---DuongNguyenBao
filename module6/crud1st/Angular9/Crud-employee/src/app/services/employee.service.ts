import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  public api: string = "http://localhost:8080/employee";

  constructor(
    public http: HttpClient
  ) { }

  getAllEmployees(): Observable<any> {
    return this.http.get(this.api);
  }

  createEmployee(Employee): Observable<any> {
    return this.http.post(this.api + '/save', Employee);
  }

  editEmployee(Employee, id): Observable<any> {
    return this.http.put(this.api + '/' + id, Employee);
  }

  getEmployeeById(id) {
    return this.http.get(this.api + '/' + id);
  }

  deleteEmployee(id): Observable<any> {
    return this.http.delete(this.api + '/' + id);
  }
}
