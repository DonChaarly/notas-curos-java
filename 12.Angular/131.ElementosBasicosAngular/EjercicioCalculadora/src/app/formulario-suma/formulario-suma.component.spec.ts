import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormularioSumaComponent } from './formulario-suma.component';

describe('FormularioSumaComponent', () => {
  let component: FormularioSumaComponent;
  let fixture: ComponentFixture<FormularioSumaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormularioSumaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormularioSumaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
