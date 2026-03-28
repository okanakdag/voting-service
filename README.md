## Overview
A Spring Boot REST API for creating polls, voting, and viewing results with deadline-based constraints. In progress.

## Features
- Create poll with multiple options
- Vote on a poll
- View poll results
- Deadline-based voting restriction

## Business Rules
- Users must be registered to create polls or vote
- Users can't vote more than once per poll
- A user can vote only once per poll
- A poll must have at least 2 options
- A poll must have a future deadline
- Voting is not allowed after deadline

## Domain model

### Entities
- Poll
- PollOption
- Vote
- User

### Relationships
- User (1) -> (*) Poll
- Poll (1) -> (*) PollOption
- User (1) -> (*) Vote
- Poll (1) -> (*) Vote (Redundant?)
- PollOption (1) -> (*) Vote
