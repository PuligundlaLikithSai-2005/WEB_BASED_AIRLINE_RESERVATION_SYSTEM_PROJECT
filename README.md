# **✈️ Web-Based Airline Reservation System**
![Web-Based Airline Reservation System.Logo](https://github.com/PuligundlaLikithSai-2005/Web-Based-Airline-Reservation-System/blob/main/Logo.png)
A Java Swing-based airline reservation application for searching international flights, calculating fares, checking seat availability, booking tickets, and storing booking information locally.





## **📌 Project Overview**

The Web-Based Airline Reservation System is a Java-based graphical reservation application designed to provide a simple flight-booking workflow.

The application allows a user to:

Select a departure location.

Select an international destination.

Choose Economic or Business class.

Enter a booking date.

Select adults, children, and infants.

Calculate the ticket price.

Check seat availability.

Confirm a booking.

Generate a ticket.

Save booking information for later use.

The main reservation window is implemented using Java Swing and JFrame. fileciteturn7file0L6-L17

## **✨ Key Features**

Feature

Description

#### 🌍 Flight Selection

Select the departure location and destination

#### 💺 Class Selection

Economic and Business class options

#### 👨‍👩‍👧 Passenger Details

Adults, children, and infants can be selected

#### 📅 Booking Date

Enter the travel/booking date

#### 💰 Fare Calculation

Calculates price based on class and passenger count

#### 🪑 Seat Availability

Checks whether seats are available before booking

#### 🎫 Ticket Generation

Creates a ticket through PrintTicket1

💾 Booking Storage

Stores booking data using Java serialization

#### 🖼️ Travel UI

Uses map1.jpg and note_bg.gif as interface images

The source defines destination options such as Bali, Bangkok, Cairo, Cape Town, Chicago, Dubai, Frankfurt, Hong Kong, Istanbul, London, Melbourne, New York, Paris, Rome, San Francisco, Shanghai, Singapore, Sydney, and Toronto. fileciteturn7file0L21-L23

## **🖥️ Application Flow**

                    ┌──────────────────────┐
                    │   Start Application  │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │ Select Destination   │
                    │ & Travel Class       │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │ Enter Booking Date   │
                    │ & Passenger Details  │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │   Find Flight /      │
                    │   Calculate Fare     │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │ Check Seat           │
                    │ Availability        │
                    └──────────┬───────────┘
                               │
                    ┌──────────┴──────────┐
                    │                     │
                 Available             Full
                    │                     │
                    ▼                     ▼
          ┌──────────────────┐    ┌────────────────┐
          │ Confirm Booking  │    │ Show "Seats    │
          │       ↓          │    │ are full"      │
          │ Generate Ticket  │    └────────────────┘
          │       ↓          │
          │ Save Booking     │
          └──────────────────┘

## **🧩 Main Components**

InternationalFlight.java

The main GUI class extends JFrame and creates the booking interface. It contains:

From/To selection

Travel class selection

Booking date

Passenger selection

Find Flight button

Map image

Notes section

The application window is configured with a size of 795 × 580. fileciteturn7file0L19-L23 fileciteturn7file0L135-L143

button2

button2 implements ActionListener and handles the Find Flight / booking logic.

It reads:

Source

Destination

Class

Booking date

Adult count

Children count

Infant count

and then determines the applicable price and flight time. fileciteturn7file0L147-L168

Save1

Save1 implements Serializable and represents the booking information stored by the application.

Stored information includes:

From

To

Class

Adult count

Children count

Infant count

Booking date

Price

Flight time

fileciteturn7file0L296-L316

## **💰 Fare & Seat-Availability Logic**

For Economic class, the application reads destination pricing and flight time from type1.row2.

For Business class, it reads the corresponding values from type1.row4. fileciteturn7file0L172-L208

The fare is then calculated using the passenger counts:

Price = Adult Fare × Adults
        + Adult Fare × (Children / 2)

The application also checks the number of booked passengers for the selected destination and date.

The maximum seat count checked by the current source is 60 seats. If the calculated count exceeds 60, the application displays:

Seats are full. Sorry!

Otherwise, the user is asked whether they want to book. fileciteturn7file0L213-L266

## **💾 Data Storage**

The application uses Java object serialization to store booking records.

The booking data is written to a local file named:

save1

The source reads existing objects using ObjectInputStream and writes updated booking objects using ObjectOutputStream. fileciteturn7file0L230-L250 fileciteturn7file0L269-L282

Note: save1 is a local serialized data file, not a database.

## **🖼️ Project Assets**

The Java source references two external image files:

map1.jpg
note_bg.gif

map1.jpg is loaded for the flight/map area, while note_bg.gif is used as the notes background. fileciteturn7file0L43-L44 fileciteturn7file0L102-L104

Recommended Repository Structure

Web-Based-Airline-Reservation-System/
│
├── LoginPage.java
├── InternationalFlight.java
├── PrintTicket1.java
├── button2.java
├── Save1.java
│
├── map1.jpg
├── note_bg.gif
│
├── save1
│
└── README.md

Important: The uploaded source references LoginPage and PrintTicket1, but their implementations are not contained in this source file. Add the original versions of those files to the repository if they are available.

## **🛠️ Technologies Used**

Java

Java Swing

AWT

Java Event Handling

Java Serialization

ObjectInputStream

ObjectOutputStream

Git & GitHub

The source imports Swing, AWT, event handling, and Java I/O packages. fileciteturn7file0L1-L4

## **🚀 How to Run**

#### 1. Install Java

Install a compatible JDK and verify:

java -version
javac -version

#### 2. Clone the Repository

git clone https://github.com/PuligundlaLikithSai-2005/Web-Based-Airline-Reservation-System.git
cd Web-Based-Airline-Reservation-System

#### 3. Keep Required Files Together

Place the Java source files and image assets in the appropriate project directory.

For the current source, the following assets are required by filename:

map1.jpg
note_bg.gif

#### 4. Compile

If all required Java classes are present:

javac *.java

#### 5. Run

The current source contains:

public static void main(String args[])
{
    LoginPage type1 = null;
    new InternationalFlight(type1);
}

so the main application entry point in this source is:

InternationalFlight

Run:

java InternationalFlight

The complete application requires the referenced LoginPage and PrintTicket1 implementations.

## **🔄 GitHub Workflow**

Source Java Files
       │
       ▼
Add Images & Dependencies
       │
       ▼
Compile & Test
       │
       ▼
git add .
       │
       ▼
git commit
       │
       ▼
git push
       │
       ▼
GitHub Repository

Push Changes

git status
git add .
git commit -m "Add airline reservation system"
git push origin main
![Outcome Image](https://github.com/PuligundlaLikithSai-2005/Web-Based-Airline-Reservation-System/blob/main/Web-Based-Airline-Reservation-System.png)
## **📸 Project Highlights**

Booking Interface

The main interface provides flight details, passenger selection, booking date, class selection, and a Find Flight action.

Flight Map

map1.jpg is displayed below the booking controls in the left panel. fileciteturn7file0L63-L79

Passenger & Notes Panel

The right panel contains adult, child, and infant selection controls together with the notes area. fileciteturn7file0L83-L131

## **🎯 Learning Outcomes**

This project demonstrates practical use of:

Java GUI development

Swing components

Event-driven programming

Object-oriented programming

File handling

Object serialization

Array-based data processing

Conditional business logic

Passenger and seat calculations

Basic Git/GitHub project management

## **🔮 Possible Future Enhancements**

The current project can be extended with:

🔐 User login and authentication

🗄️ MySQL/Oracle database integration

💳 Online payment integration

📧 Email ticket confirmation

🪑 Visual seat selection

🔎 Advanced flight search

📱 Responsive web/mobile interface

🧾 PDF ticket generation

👨‍💼 Admin dashboard

📊 Booking and revenue reports

## 👨‍💻 **Author**

## **P Likithsai**

#### 🔗 GitHub:
https://github.com/PuligundlaLikithSai-2005

#### 🔗 Project Repository:
https://github.com/PuligundlaLikithSai-2005/Web-Based-Airline-Reservation-System

## **📄 License**

This project is intended for educational and learning purposes.

## **⭐ Support**

If you find this project useful, consider giving the repository a ⭐ on GitHub.
