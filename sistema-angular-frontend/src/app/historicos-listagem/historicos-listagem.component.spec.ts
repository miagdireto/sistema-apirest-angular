import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HistoricosListagemComponent } from './historicos-listagem.component';

describe('HistoricosListagemComponent', () => {
  let component: HistoricosListagemComponent;
  let fixture: ComponentFixture<HistoricosListagemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HistoricosListagemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HistoricosListagemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
