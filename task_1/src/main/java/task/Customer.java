package main.java.task;

import java.util.ArrayList;
import java.util.List;

// model: Customer class is model part in mvc. It handles the main data related customers including records of application
public class Customer {
  // 고객 관련 데이터 선언
  // private 선언: 데이터 무결성 유지 및 제어된 접근 제공
  private String phoneNumber;
  private String ownerName;
  private String petName;
  private String address;
  private String species;
  private int birthYear;
//  private List<MedicalRecord> medicalRecords; // 진료 기록을 저장하는 리스트

  // 기본 생성자 선언: 기본 생성자X, 객체 생성시 모든 필드 매번 초기화
  // 객체 생성 후 setter 메서드를 통해 필요한 값만 설정
  public Customer() {

  }

  // 모든 필드를 초기화하는 생성자
  // customer 객체를 만들 때 필드를 한번에 초기화 가능
  // 필드 값 설정을 보장: 객체 생성시 필요한 값을 설정
  public Customer(String phoneNumber, String ownerName, String petName, String address, String species, int birthYear) {
    this.phoneNumber = phoneNumber;
    this.ownerName = ownerName;
    this.petName = petName;
    this.address = address;
    this.species = species;
    this.birthYear = birthYear;
//    this.medicalRecords = new ArrayList<>(); // 빈 리스트로 초기화 (null 방지)
  }

  // setter, getter 선언: 캡슐화로 외부에서 수정 못하게 보호
  // 필요한 경우 데이터 수정을 위한 로직 (getter, setter)
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public String getPetName() {
    return petName;
  }

  public void setPetName(String petName) {
    this.petName = petName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public int getBirthYear() {
    return birthYear;
  }

  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

}
