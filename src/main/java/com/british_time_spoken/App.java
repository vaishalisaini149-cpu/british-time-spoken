package com.british_time_spoken;

import java.util.Scanner;

import Service.TimeToWordsConverter;


public class App 
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimeToWordsConverter converter = new TimeToWordsConverter();

        System.out.println("Enter time in HH:mm (24-hour format): ");
        String input = scanner.nextLine();

        try {
            String spokenForm = converter.convert(input);
            System.out.println("British spoken form: " + spokenForm);
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid input: " + e.getMessage());
        }
    }
}
