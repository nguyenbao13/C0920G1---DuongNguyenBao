import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NameCardComponent } from './name-card/name-card.component';
import { ProgressBarComponent } from './progress-bar/progress-bar.component';
import { CountdownTimerAliasComponent } from './countdown-timer-alias/countdown-timer-alias.component';
import { CountdownTimerComponent } from './countdown-timer/countdown-timer.component';
import { CountdownTimerEventComponent } from './countdown-timer-event/countdown-timer-event.component';
import { CountdownTimerEventAliasComponent } from './countdown-timer-event-alias/countdown-timer-event-alias.component';
import { CountdownTimerGetSetComponent } from './countdown-timer-get-set/countdown-timer-get-set.component';
import { CountdownTimerOnchangesComponent } from './countdown-timer-onchanges/countdown-timer-onchanges.component';
import { PipeDemoComponent } from './pipe-demo/pipe-demo.component';
import { RatingBarComponent } from './rating-bar/rating-bar.component';
import { ViewDefaultComponent } from './view-default/view-default.component';
import { ViewEncapsulationComponent } from './view-encapsulation/view-encapsulation.component';
import { ViewNoneComponent } from './view-none/view-none.component';
import { ViewShadowDomComponent } from './view-shadow-dom/view-shadow-dom.component';

@NgModule({
  declarations: [
    AppComponent,
    NameCardComponent,
    ProgressBarComponent,
    CountdownTimerComponent,
    CountdownTimerAliasComponent,
    CountdownTimerEventComponent,
    CountdownTimerEventAliasComponent,
    CountdownTimerGetSetComponent,
    CountdownTimerOnchangesComponent,
    PipeDemoComponent,
    RatingBarComponent,
    ViewDefaultComponent,
    ViewEncapsulationComponent,
    ViewNoneComponent,
    ViewShadowDomComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
