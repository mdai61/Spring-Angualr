import { Component } from '@angular/core';
import { DataService } from '../services/data.service';

@Component({
  selector: 'app-data-form',
  templateUrl: './data-form.component.html',
  styleUrls: ['./data-form.component.scss'],
})
export class DataFormComponent {
  filePath: string = '';

  constructor(private dataService: DataService) {}

  processData() {
    this.dataService.processData(this.filePath).subscribe(response => {
      console.log('Processed Data:', response);
    });
  }

  trainModel() {
    this.dataService.trainModel(this.filePath).subscribe(response => {
      alert('Model Training Started!');
    });
  }
}