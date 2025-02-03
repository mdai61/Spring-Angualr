import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class DataService {
  private apiUrl = 'http://localhost:8080/api/data';

  constructor(private http: HttpClient) {}

  processData(filePath: string): Observable<any> {
    return this.http.get(`${this.apiUrl}/process?filePath=${filePath}`);
  }

  trainModel(filePath: string): Observable<string> {
    return this.http.post(`${this.apiUrl}/train?filePath=${filePath}`, null, { responseType: 'text' });
  }
}