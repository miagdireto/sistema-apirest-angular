import { HttpClientModule} from '@angular/common/http'
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HistoricosListagemComponent } from './historicos-listagem/historicos-listagem.component';
import { HistoricoService } from './historico.service';

@NgModule({
  declarations: [
    AppComponent,
    HistoricosListagemComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [ HistoricoService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
