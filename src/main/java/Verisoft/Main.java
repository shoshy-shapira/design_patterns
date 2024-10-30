package Verisoft;

import Verisoft.ChocolateBarFactory.ChocolateBar;
import Verisoft.ChocolateBarFactory.factory.ChocolateBarFactory;
import Verisoft.ChocolateBarFactory.factory.DarkChocolateBarFactory;
import Verisoft.ChocolateBarFactory.factory.MilkChocolateBarFactory;
import Verisoft.ChocolateBarFactory.factory.WhiteChocolateBarFactory;
import Verisoft.FashionDesignStudio.*;
import Verisoft.ParkDesign.Flower;
import Verisoft.ParkDesign.FlowerBed;
import Verisoft.ParkDesign.Tree;
import Verisoft.PlushToyFactory.Bunny;
import Verisoft.PlushToyFactory.Kitten;
import Verisoft.PlushToyFactory.TeddyBear;
import Verisoft.PlushToyFactory.Toy;
import Verisoft.RemoteControlCars.Car;
import Verisoft.RemoteControlCars.CarImpl;
import Verisoft.RemoteControlCars.RemoteControl;
import Verisoft.RemoteControlCars.RemoteControlImpl;
import Verisoft.SingletonExample.Logger;
import Verisoft.TravelBooking.TravelBookingFacade;
import Verisoft.VacationPackages.Client;
import Verisoft.VacationPackages.DestinationFlyweightFactory;
import Verisoft.VinylRecordStore.ModernMediaPlayer;
import Verisoft.VinylRecordStore.RecordPlayer;
import Verisoft.VinylRecordStore.RecordPlayerAdapter;
import Verisoft.VinylRecordStore.VinylRecordPlayer;
import Verisoft.builder.ApiRequest;
import Verisoft.builder.ApiRequestBuilder;

public class Main {
    public static void main(String[] args) {
        //Logger
        System.out.println("*****logger*****\n");
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First log message");
        logger2.log("Second log message");
        System.out.println("Are both loggers the same instance? " + (logger1 == logger2));


        //ApiRequest
        System.out.println("*****apiRequest*****\n");
        ApiRequest apiRequest = new ApiRequestBuilder()
                .setUrl("https://api.example.com")
                .setMethod("GET")
                .setHeader("Authorization", "Bearer token")
                .setParameter("key", "value")
                .setBody("{\"key\": \"value\"}")
                .build();

        System.out.println("URL: " + apiRequest.getUrl());
        System.out.println("Method: " + apiRequest.getMethod());
//toys
        System.out.println("*****toys*****\n");
        // Create original plush toys
        Toy teddyBear = new TeddyBear("brown", "large");
        Toy bunny = new Bunny("white", "small");
        Toy kitten = new Kitten("gray", "medium");

        // Clone toys with different variations
        Toy teddyBearClone = teddyBear.clone();
        Toy bunnyClone = bunny.clone();
        Toy kittenClone = kitten.clone();

        // Display toy attributes to verify different variations
        System.out.println("Original Teddy Bear - Color: " + teddyBear.getColor() + ", Size: " + teddyBear.getSize());
        System.out.println("Cloned Teddy Bear - Color: " + teddyBearClone.getColor() + ", Size: " + teddyBearClone.getSize());

        System.out.println("Original Bunny - Color: " + bunny.getColor() + ", Size: " + bunny.getSize());
        System.out.println("Cloned Bunny - Color: " + bunnyClone.getColor() + ", Size: " + bunnyClone.getSize());

        System.out.println("Original Kitten - Color: " + kitten.getColor() + ", Size: " + kitten.getSize());
        System.out.println("Cloned Kitten - Color: " + kittenClone.getColor() + ", Size: " + kittenClone.getSize());

        //chocolateBar
        // Creates instances of different chocolate bars using their respective factories.
        System.out.println("*****chocolateBar*****\n");
        ChocolateBarFactory darkFactoy = new DarkChocolateBarFactory();
        ChocolateBarFactory whiteFactory = new WhiteChocolateBarFactory();
        ChocolateBarFactory milkFactory = new MilkChocolateBarFactory();

        // Create and test a dark chocolate bar
        ChocolateBar darkChocolate = darkFactoy.createChocolateBar();
        darkChocolate.produce();
        darkChocolate.packageBar();

        // Create and test a milk chocolate bar
        ChocolateBar milkChocolate = milkFactory.createChocolateBar();
        milkChocolate.produce();
        milkChocolate.packageBar();

        // Create and test a white chocolate bar
        ChocolateBar whiteChocolate = whiteFactory.createChocolateBar();
        whiteChocolate.produce();
        whiteChocolate.packageBar();

//fashionDesignStudio
        System.out.println("*****fashionDesignStudio*****\n");

        // Creating factories for different outfit types
        OutfitFactory casualFactory = new CasualOutfitFactory();
        OutfitFactory formalFactory = new FormalOutfitFactory();

        // Creating and designing casual outfit
        Top casualTop = casualFactory.createTop();
        Botton casualBotton = casualFactory.createBotton();
        casualTop.design();
        casualBotton.design();

        // Creating and designing formal outfit
        Top formalTop = formalFactory.createTop();
        Botton formalBotton = formalFactory.createBotton();
        formalTop.design();
        formalBotton.design();

//vinylRecordStore
        System.out.println("*****vinylRecordStore*****\n");

        // Create an instance of VinylRecordPlayer
        RecordPlayer vinylPlayer = new VinylRecordPlayer();

        // Use the adapter to treat VinylRecordPlayer as a ModernMediaPlayer
        ModernMediaPlayer mediaPlayerAdapter = new RecordPlayerAdapter(vinylPlayer);

        // Play and pause using the adapter
        mediaPlayerAdapter.play();
        mediaPlayerAdapter.pause();
//parkDesign
        System.out.println("*****parkDesign*****\n");
// Create individual flowers
        Flower rose = new Flower("Rose");
        Flower tulip = new Flower("Tulip");
        // Create a flower bed and add flowers to it

        FlowerBed flowerBed = new FlowerBed("Spring Flower Bed");
        flowerBed.add(rose);
        flowerBed.add(tulip);

        // Create a tree and add the flower bed to it
        Tree oakTree = new Tree("Oak Tree");
        oakTree.add(flowerBed);
        // Create a main park element and add trees and flower beds
        Tree park = new Tree("Main Park Area");
        park.add(oakTree);
        park.add(tulip);
        // Display the park structure
        park.display();
        park.remove(tulip);
        park.display();
        park.add(flowerBed);
        park.remove(oakTree);
        park.display();

        //VacationPackages
        System.out.println("*****VacationPackages*****\n");
        DestinationFlyweightFactory factory = new DestinationFlyweightFactory();
        //clients
        Client client1 = new Client("shoshy", factory);
        Client client2 = new Client("yeuda", factory);
//book vacations
        client1.bookVaction("paris", "FR", "2024-06-15", "grand hotel paris");
        client2.bookVaction("torkia", "TR", "2024-08-15", "aradis hotel");
        client2.bookVaction("paris", "FR", "2024-07-20", "Petit Hotel Paris");

        System.out.println("Total unique destinations created: " + factory.countDestinations());

//RemoteControlCar
        System.out.println("*****RemoteControlCar*****\n");

        // Create different car models
        Car car1 = new CarImpl("Speedster", 100, "Red");
        Car car2 = new CarImpl("Turbo", 120, "Blue");

        // Create remote controls for each car
        RemoteControl remote1 = new RemoteControlImpl(car1);
        RemoteControl remote2 = new RemoteControlImpl(car2);

        // Test car movements
        System.out.println("Controlling Speedster:");
        remote1.moveForward();
        remote1.turnLeft();
        remote1.moveBackward();

        System.out.println("\nControlling Turbo:");
        remote2.moveForward();
        remote2.turnRight();
        remote2.moveBackward();

//TravelBookingFacade
        System.out.println("*****TravelBookingFacade*****\n");

        TravelBookingFacade travelBooking = new TravelBookingFacade();


        travelBooking.bookFlight("Israel","Paris","30-10-2024");
        travelBooking.bookHotel("Paris",3);
        travelBooking.bookRentalCar("Paris","BYD",3,5);
    }

}