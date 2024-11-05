package Verisoft;

import Verisoft.ArtGallery.ArtworkProxy;
import Verisoft.ArtGallery.RealArtwork;
import Verisoft.ChainOfResponsibilityExample.DocHandler;
import Verisoft.ChainOfResponsibilityExample.DocumentHandler;
import Verisoft.ChainOfResponsibilityExample.PDFHandler;
import Verisoft.ChainOfResponsibilityExample.TextHandler;
import Verisoft.ChocolateBarFactory.ChocolateBar;
import Verisoft.ChocolateBarFactory.factory.ChocolateBarFactory;
import Verisoft.ChocolateBarFactory.factory.DarkChocolateBarFactory;
import Verisoft.ChocolateBarFactory.factory.MilkChocolateBarFactory;
import Verisoft.ChocolateBarFactory.factory.WhiteChocolateBarFactory;
import Verisoft.CommandPatternExample.*;
import Verisoft.CustomCakes.BasicCake;
import Verisoft.CustomCakes.Cake;
import Verisoft.CustomCakes.FlavorDecorator;
import Verisoft.CustomCakes.ToppingDecorator;
import Verisoft.FashionDesignStudio.*;
import Verisoft.InterpreterPatternExample.RomanNumeralsInterpreter;
import Verisoft.MediatorPatternExample.ChatRoom;
import Verisoft.MediatorPatternExample.User;
import Verisoft.MementoPatternExample.History;
import Verisoft.MementoPatternExample.TextEditor;
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
import Verisoft.ShippingService.ExpressShipping;
import Verisoft.ShippingService.SameDayShipping;
import Verisoft.ShippingService.ShippingContext;
import Verisoft.ShippingService.StandardShipping;
import Verisoft.SingletonExample.Logger;
import Verisoft.TemplateMethodExample.Chess;
import Verisoft.TemplateMethodExample.Game;
import Verisoft.TemplateMethodExample.Soccer;
import Verisoft.TravelBooking.TravelBookingFacade;
import Verisoft.VacationPackages.Client;
import Verisoft.VacationPackages.DestinationFlyweightFactory;
import Verisoft.VendingMachine.VendingMachine;
import Verisoft.VinylRecordStore.ModernMediaPlayer;
import Verisoft.VinylRecordStore.RecordPlayer;
import Verisoft.VinylRecordStore.RecordPlayerAdapter;
import Verisoft.VinylRecordStore.VinylRecordPlayer;
import Verisoft.VisitorPatternExample.*;
import Verisoft.WeatherStation.CurrentConditionsDisplay;
import Verisoft.WeatherStation.ForecastDisplay;
import Verisoft.WeatherStation.StatisticsDisplay;
import Verisoft.WeatherStation.WeatherStation;
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
        System.out.println("-------------");

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
        System.out.println("-------------");

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
        System.out.println("-------------");

//vinylRecordStore
        System.out.println("*****vinylRecordStore*****\n");

        // Create an instance of VinylRecordPlayer
        RecordPlayer vinylPlayer = new VinylRecordPlayer();

        // Use the adapter to treat VinylRecordPlayer as a ModernMediaPlayer
        ModernMediaPlayer mediaPlayerAdapter = new RecordPlayerAdapter(vinylPlayer);

        // Play and pause using the adapter
        mediaPlayerAdapter.play();
        mediaPlayerAdapter.pause();
        System.out.println("-------------");

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
        System.out.println("-------------");

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
        System.out.println("-------------");

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
        System.out.println("-------------");

//TravelBookingFacade
        System.out.println("*****TravelBookingFacade*****\n");

        TravelBookingFacade travelBooking = new TravelBookingFacade();


        travelBooking.bookFlight("Israel", "Paris", "30-10-2024");
        travelBooking.bookHotel("Paris", 3);
        travelBooking.bookRentalCar("Paris", "BYD", 3, 5);
        System.out.println("-------------");

//CustomCakes
        System.out.println("*****CustomCakes*****\n");

        // Create a basic cake
        Cake cake = new BasicCake();
        System.out.println(cake.getDescription() + " - $" + cake.getPrice());

        // Add flavor to the cake
        cake = new FlavorDecorator(cake, "Chocolate", 2.50);
        System.out.println(cake.getDescription() + " - CH" + cake.getPrice());

        // Add topping to the cake
        cake = new ToppingDecorator(cake, "Sprinkles", 1.00);
        System.out.println(cake.getDescription() + " CH" + cake.getPrice());
        System.out.println("-------------");

//ArtworkProxy
        System.out.println("*****ArtworkProxy*****\n");

        RealArtwork realArtwork = new RealArtwork("Starry Night", 1000000);

        // User with authorization
        ArtworkProxy authorizedProxy = new ArtworkProxy(realArtwork, true);
        authorizedProxy.viewArtwork(); // Should allow viewing
        authorizedProxy.purchaseArtwork(); // Should allow purchasing

        // User without authorization
        ArtworkProxy unauthorizedProxy = new ArtworkProxy(realArtwork, false);
        unauthorizedProxy.viewArtwork(); // Should deny viewing
        unauthorizedProxy.purchaseArtwork(); // Should deny purchasing
        System.out.println("-------------");

//ShippingService
        System.out.println("*****ShippingService*****\n");

        ShippingContext context = new ShippingContext();

        // Using StandardShipping
        context.setShippingStrategy(new StandardShipping());
        System.out.println("Standard Shipping Cost: " + context.calculateShippingCost(10, 100));

        // Using ExpressShipping
        context.setShippingStrategy(new ExpressShipping());
        System.out.println("Express Shipping Cost: " + context.calculateShippingCost(10, 100));

        // Using SameDayShipping
        context.setShippingStrategy(new SameDayShipping());
        System.out.println("Same Day Shipping Cost: " + context.calculateShippingCost(10, 100));
        System.out.println("-------------");

//WeatherStation
        System.out.println("*****WeatherStation*****\n");

        // Create weather station (subject)
        WeatherStation weatherStation = new WeatherStation();

        // Create displays (observers)
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        // Register displays with the weather station
        weatherStation.addDisplay(currentDisplay);
        weatherStation.addDisplay(statisticsDisplay);
        weatherStation.addDisplay(forecastDisplay);

        // Simulate temperature changes
        weatherStation.setTemperature(25.0f);
        weatherStation.setTemperature(30.0f);
        weatherStation.setTemperature(20.0f);
        System.out.println("-------------");

        //CommandPatternExample
        System.out.println("*****CommandPatternExample*****\n");
        Television television = new Television();

        // Create command instances
        Command turnOn = new TurnOnCommand(television);
        Command turnOff = new TurnOffCommand(television);
        Command changeChannel = new ChangeChannelCommand(television, 5);

        // Create remote control invoker
        RemoteControlA remote = new RemoteControlA();

        // Execute commands
        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(changeChannel);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();
        System.out.println("-------------");

//MementoPatternExample
        System.out.println("*****MementoPatternExample*****\n");


        TextEditor editor = new TextEditor();
        History history = new History();

        // Set content and save the state
        editor.setContent("Hello");
        history.save(editor.save());
        System.out.println("Content: " + editor.getContent());

        // Change content and save again
        editor.setContent("Hello, World!");
        history.save(editor.save());
        System.out.println("Content: " + editor.getContent());

        // Change content without saving
        editor.setContent("Hello, World! How are you?");
        System.out.println("Content: " + editor.getContent());

        // Undo to last saved state
        editor.restore(history.undo());
        System.out.println("After undo: " + editor.getContent());

        // Undo to initial state
        editor.restore(history.undo());
        System.out.println("After undo: " + editor.getContent());
        System.out.println("-------------");

        //VendingMachine
        System.out.println("*****VendingMachine*****\n");

        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin();      // Expected: Insert coin
        vendingMachine.selectProduct();   // Expected: Select product
        vendingMachine.dispense();        // Expected: Dispense product

        vendingMachine.insertCoin();      // Expected: Insert coin
        vendingMachine.selectProduct();   // Expected: Select product
        vendingMachine.dispense();        // Expected: Dispense product
        System.out.println("-------------");

        //TemplateMethodExample
        System.out.println("*****TemplateMethodExample*****\n");
        Game chess = new Chess();
        chess.play();  //  play method for chess

        System.out.println();

        Game soccer = new Soccer();
        soccer.play();  //  play method for soccer
        System.out.println("-------------");


        //MediatorPatternExample
        System.out.println("*****MediatorPatternExample*****\n");
        ChatRoom chatRoom = new ChatRoom();

        User user1 = new User("Alice", chatRoom);
        User user2 = new User("Bob", chatRoom);
        User user3 = new User("Charlie", chatRoom);

        // Add users to the chat room
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        // Users send messages to the chat room
        user1.send("Hello everyone!");
        user2.send("Hi Alice!");
        user3.send("Good morning!");
        System.out.println("-------------");

//ChainOfResponsibilityExample
        System.out.println("*****ChainOfResponsibilityExample*****\n");


        // Create the chain of handlers
        DocumentHandler pdfHandler = new PDFHandler();
        DocumentHandler docHandler = new DocHandler();
        DocumentHandler textHandler = new TextHandler();

        pdfHandler.setNextHandler(docHandler);
        docHandler.setNextHandler(textHandler);

        // Send requests to open documents of various types
        pdfHandler.openDocument("pdf");   // Opens PDF document
        pdfHandler.openDocument("doc");    // Opens Doc document
        pdfHandler.openDocument("txt");    // Opens Text document
        pdfHandler.openDocument("jpg");    // Displays error message

        System.out.println("-------------");

        //InterpreterPatternExample
        System.out.println("*****InterpreterPatternExample*****\n");

        RomanNumeralsInterpreter interpreter = new RomanNumeralsInterpreter();

        // Test various Roman numerals
        System.out.println("XIV = " + interpreter.interpret("XIV")); // Output: 14
        System.out.println("MMXXIV = " + interpreter.interpret("MMXXIV")); // Output: 2024
        System.out.println("XLII = " + interpreter.interpret("XLII")); // Output: 42
        System.out.println("CMXCIX = " + interpreter.interpret("CMXCIX")); // Output: 999

        System.out.println("-------------");

        //VisitorPatternExample
        System.out.println("*****VisitorPatternExample*****\n");
        // Create document and add elements
        Document document = new Document();
        document.addElement(new TextSection("This is a sample text with some words."));
        document.addElement(new TextSection("Another text section."));
        document.addElement(new ImageSection());
        document.addElement(new TableSection());

        // Create a visitor to collect statistics
        DocumentStatisticsVisitor visitor = new DocumentStatisticsVisitor();

        // Accept the visitor in the document
        document.accept(visitor);

        // Print statistics
        System.out.println("Word count: " + visitor.getWordCount());
        System.out.println("Image count: " + visitor.getImageCount());
        System.out.println("Table count: " + visitor.getTableCount());


    }



}



