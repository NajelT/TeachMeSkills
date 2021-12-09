package com.TMS.Lesson5;

public abstract class Employee extends Person{
   EMPLOYEE_ENUM[] jobTitle = EMPLOYEE_ENUM.values();
   EMPLOYEE_ENUM director = EMPLOYEE_ENUM.DIRECTOR;
   EMPLOYEE_ENUM worker = EMPLOYEE_ENUM.WORKER;


   int dirCoef = EMPLOYEE_ENUM.DIRECTOR.getCoef();
   int workerCoef = EMPLOYEE_ENUM.WORKER.getCoef();
   int experience;
   int baseRate;



   public int getExperience() {
      return experience;
   }

   public void setExperience(int experience) {
      this.experience = experience;
   }

   public int salaryCounterForDir(int experience, int dirCoef, int baseRate ){
      this.experience = experience;
      this.dirCoef = dirCoef;
      this.baseRate = baseRate;
      int result = experience*dirCoef*baseRate;
      return result;
   }

   public int salaryCounterForWorker(int experience, int workerCoef, int baseRate ){
      this.experience = experience;
      this.workerCoef = workerCoef;
      this.baseRate = baseRate;
      int result = experience*dirCoef*baseRate;
      return result;
   }

   public abstract void setEmployeeJobTitle();
}
