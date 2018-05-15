import {Component} from '@angular/core';
import {Router} from '@angular/router';
import {AuthenticationService} from './_services/authentication.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';

  constructor(private router: Router, private auth: AuthenticationService) {
  }

  logout() {
    this.auth.logout();
    this.router.navigateByUrl('/login');
  }
}
