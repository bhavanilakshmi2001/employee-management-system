package com.example.Employee_Management_System.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;



@Entity
@Data
public class Employee {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long Id;
   
   @NotBlank(message="Name is required")
   private String name;

   @NotBlank(message = "Email is required")
   @Email(message="Invalid email format")
   private String email;
  
   @NotBlank(message = "Phone Number is required")
   @Pattern(regexp="^[0-9]{10}$",message="Phone number must be 10 digits")
   private String phoneNo;
  

   private String jobTitle;
   private int salary;

   public boolean isEmpty() {
    return false;
}

}
