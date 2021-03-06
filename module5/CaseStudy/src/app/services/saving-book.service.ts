import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SavingBookService {
  public API: string = 'http://localhost:3000/saving-book';

  constructor(
    public http: HttpClient
  ) { }

  getAllSavingBooks(): Observable<any> {
    return this.http.get(this.API);
  }


  editSavingBook(savingBook, id): Observable<any> {
    return this.http.put(this.API + '/' + id, savingBook);
  }

  getSavingBookById(id) {
    return this.http.get(this.API + '/' + id);
  }

  deleteSavingBook(id): Observable<any> {
    return this.http.delete(this.API + '/' + id);
  }
}
