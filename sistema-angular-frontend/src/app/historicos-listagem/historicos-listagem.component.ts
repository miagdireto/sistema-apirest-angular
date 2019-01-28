import { Component, OnInit } from '@angular/core';
import { HistoricoService } from '../historico.service';

@Component({
  selector: 'app-historicos-listagem',
  templateUrl: './historicos-listagem.component.html',
  styleUrls: ['./historicos-listagem.component.css']
})
export class HistoricosListagemComponent implements OnInit {

  historico:Array<any>;
 
  constructor(private historicoService: HistoricoService) { }

  ngOnInit() {
    this.listar();
  }

  listar(){
    this.historicoService.listar().subscribe(dados => this.historico = dados);

  }

}
