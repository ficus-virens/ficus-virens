import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';            // <-- required

import { FicusVirensRoutingModule } from './ficus-virens-routing.module';
import { FicusVirensApp } from './ficus-virens-app';
import {HttpClientModule} from '@angular/common/http';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import { authInterceptorProviders } from './core/helpers/auth.interceptor';
import { FormsModule } from '@angular/forms';
import { AdminModule } from './admin/admin.module';
import { CoreModule } from './core/core.module';
import { HomeModule } from './home/home.module';
import { SharedModule } from './shared/shared.module';
import { MatGridListModule } from '@angular/material/grid-list';

@NgModule({
  declarations: [
    FicusVirensApp,
  ],
  imports: [
    BrowserModule,
    FicusVirensRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    CommonModule,
    FormsModule,
    CoreModule,
    AdminModule,
    HomeModule,
    SharedModule,
    MatGridListModule,
  ],
  providers: [ authInterceptorProviders ],
  bootstrap: [ FicusVirensApp ]
})
export class FicusVirensModule { }
