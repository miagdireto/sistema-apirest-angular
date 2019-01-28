import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HistoricoService {

  historicosUrl = 'http://localhost:8080/api/historicos';

  constructor(private http: HttpClient) { }

  listar(){

    return this.http.get<any[]>(`${this.historicosUrl}`);

  }

}
