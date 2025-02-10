# Tournament Management System

## Overview
The **Tournament Management System** is a Java-based application that allows administrators to create and manage tournaments, teams, and players. The system also simulates matches and generates leaderboards based on match results.

## Features
- Create tournaments with specific games, formats, and schedules.
- Add teams and players as participants.
- Generate match schedules automatically.
- Simulate matches and determine winners randomly.
- Maintain player statistics (wins/losses).
- Display leaderboards for each tournament.

## Technologies Used
- **Java** (Core logic and OOP principles)
- **Java Collections Framework** (List, ArrayList for storing entities)

## Installation & Setup
1. **Clone the repository:**
   ```sh
   git clone https://github.com/jktrilok04/eSports-Tournament-Management-System-.git
   ```
2. **Navigate to the project directory:**
   ```sh
   cd tournament-management
   ```
3. **Compile the Java files:**
   ```sh
   javac *.java
   ```
4. **Run the application:**
   ```sh
   java Driver
   ```

## Project Structure
```
├── Driver.java          # Main entry point of the application
├── Admin.java           # Admin class to manage tournaments
├── Player.java          # Represents a player in the tournament
├── Team.java            # Represents a team consisting of players
├── Tournament.java      # Handles tournament creation and match scheduling
├── Match.java           # Represents a match between teams
├── MatchResult.java     # Stores the result of a match
├── Leaderboard.java     # Manages and displays leaderboard standings
└── Caster.java          # Logs match results
```

## Usage
### 1. Creating a Tournament
```java
Admin admin = new Admin();
Tournament tournament = admin.createTournament("Championship", "Game X", new Date(), new Date(), "Round Robin");
```

### 2. Adding Teams and Players
```java
Team teamA = new Team("Team A");
teamA.addPlayer(new Player("JohnDoe", "password123", "john@example.com"));
tournament.addParticipant(teamA);
```

### 3. Generating and Simulating Matches
```java
tournament.generateMatchSchedule();
```

### 4. Displaying Leaderboard
```java
displayLeaderboard(tournament);
```

## Expected Output Format
```
Tournament "Championship" created successfully.
Simulating matches:
--------------------
Match: Team A vs Team B
Winner: Team A
Match: Team B vs Team C
Winner: Team C

Leaderboard:
-------------------------
Rank    Player      Wins    Losses
1       JohnDoe     2       0
2       JaneDoe     1       1
```

## Future Improvements
- Implementing a database for persistent storage.
- Adding a graphical user interface (GUI).
- Allowing user-defined match rules and formats.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

