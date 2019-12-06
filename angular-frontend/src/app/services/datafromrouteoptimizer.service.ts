import {Injectable} from '@angular/core';
import {Router} from '@angular/router';
import {environment} from '../../environments/environment';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DatafromrouteoptimizerService {

  constructor(private router: Router,
              private http: HttpClient
  ) {
  }

  async getorderdatafromrouteoptimizer(retailerId: number) {
    const url = environment.apiUrl + 'api/v1/routes/' + retailerId;
    await this.http.get(url).toPromise().then(
      (result: string) => {
        return JSON.parse(result);
      });
  }

}
