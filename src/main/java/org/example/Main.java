package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные: Фамилия Имя Отчество датарождения номертелефона пол");
        String input = scanner.nextLine();

        String[] data = input.split(" ");
        if (data.length != 6) {
            System.out.println("Ошибка: неверное количество данных");
            return;
        }

        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];
        LocalDate birthDate;
        try {
            birthDate = LocalDate.parse(data[3], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка: неверный формат даты рождения");
            return;
        }
        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(data[4]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат номера телефона");
            return;
        }
        char gender = data[5].charAt(0);
        if (gender != 'f' && gender != 'm') {
            System.out.println("Ошибка: неверный формат пола");
            return;
        }

        String fileName = lastName + ".txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(lastName + firstName + middleName + birthDate + " " + phoneNumber + gender + "\n");
            System.out.println("Данные успешно записаны в файл " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
