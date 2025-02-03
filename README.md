
# 🌟 Spring Boot + Angular Full Stack Project

This project is a **full-stack web application** built with **Spring Boot** (backend) and **Angular** (frontend). It processes financial data, performs feature selection, and trains an ML model using XGBoost.

---

## 📂 **Project Structure**
project_root/ │── backend/ │ ├── /controller │ │ ├── DataController.java │ ├── /service │ │ ├── DataService.java │ │ ├── ModelTrainingService.java │ ├── /repository │ │ ├── DataRepository.java │ ├── /model │ │ ├── DataFrame.java │ │ ├── DataRow.java │ ├── Application.java │── frontend/ │ ├── /components │ │ ├── data-form.component.ts │ ├── /services │ │ ├── data.service.ts │ ├── app.module.ts │── README.md │── pom.xml
markdown
CopyEdit

---

## 🛠 **Technologies Used**
### Backend:
- **Spring Boot** (REST API)
- **Spring Web** (Controller & Service)
- **Apache Commons CSV** (Data Handling)
- **JFreeChart** (Data Visualization)
- **Apache Commons Math** (Feature Selection)

### Frontend:
- **Angular 16**
- **TypeScript**
- **Bootstrap 5**
- **HTTP Client (REST API Integration)**

---

## 🚀 **Setup Instructions**
### ✅ **1️⃣ Clone the Repository**
```sh
git clone https://github.com/mdai61/Spring-Angualr.git
cd Spring-Angualr
________________________________________
✅ 2️⃣ Run the Backend (Spring Boot)
1.	Navigate to the backend folder:
sh
CopyEdit
cd backend
2.	Build and start the server:
sh
CopyEdit
mvn spring-boot:run
3.	The backend will start on:
bash
CopyEdit
http://localhost:8080/api/data
________________________________________
✅ 3️⃣ Run the Frontend (Angular)
1.	Navigate to the frontend folder:
sh
CopyEdit
cd frontend
2.	Install dependencies:
sh
CopyEdit
npm install
3.	Start the Angular server:
sh
CopyEdit
ng serve
4.	Open in browser:
arduino
CopyEdit
http://localhost:4200
________________________________________
🔥 API Endpoints (Spring Boot)
Method	Endpoint	Description
GET	/api/data/process?filePath={path}	Processes the dataset from the given file path
POST	/api/data/train?filePath={path}	Trains the ML model with the dataset
________________________________________
📌 Usage Instructions
1.	Upload Data File
o	Enter the file path in the frontend form.
o	Click "Process Data" to load and preprocess the dataset.
2.	Train Machine Learning Model
o	Click "Train Model" to start training with XGBoost.
o	The backend processes the data and runs the model.
________________________________________
🎯 Future Enhancements
•	✅ Add JWT Authentication for security
•	✅ Integrate Docker for containerization
•	✅ Deploy on AWS / Heroku
•	✅ Use PostgreSQL / MongoDB for database storage
________________________________________
👨💻 Author
•	Name: [Your Name]
•	GitHub: github.com/mdai61
•	Email: [your.email@example.com]
________________________________________
🎉 Contributions
Feel free to fork this repo and submit pull requests! 🚀
yaml
CopyEdit

---

## **📂 Add README.md to Your GitHub**
Run this in your **project root directory**:
```sh
echo "# Spring Boot + Angular Full Stack Project" > README.md
git add README.md
git commit -m "Added project README"
git push origin main

