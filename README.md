# Is is their birthday?

You have a friend whose birthday you forget? A significant other whose birthday you keep thinking is like a month off of where it really is?

This project is for you, and also for me for the same reason.

## Table of Contents

1. [Installation](#installation)
2. [Contributing](#contributing)
3. [License](#license)

## Installation

`mvn clean package` to build the jar and then set the required environment variables or use one of the other ways to configure a Spring Boot application.

The environment variables required are

1. `BIRTHDAYDATE`, the date of the birthday. Formatted as `--MM-dd`, like `--11-14` for November 14
2. `CELEBRANTNAME`, the name of the person whose birthday you want to talk about.

Then, you can run the application like this: `BIRTHDAYDATE="--11-14" CELEBRANTNAME=Christina java -jar target/is-it-their-birthday-0.0.1-SNAPSHOT.jar`

While running, the application exposes a health check at `/actuator/health` and a simple web page stating if it is the person's birthday or not.

## Limitations

The application currently treats all birthday as occurring in Pacific time ("America/Los_Angeles")

## Contributing

I don't know why you'd want to add something, but if you think it'd be good,

1. Fork this project
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request back here

**[Back to top](#table-of-contents)**

## History

I wrote this as a bit of a joke.

Version 0.0.1 does what it needs to do:

* Accepts a name and a day of a month
* Says "NO" if it is not the correct day of the month
* Says "YES" if it is the correct day of the month (in Pacific time)
* Exposes an API at /api/isitreallythough that returns a json {"answer": "YES"} or {"answer": "NO" }, because machines should be able to celebrate our birthdays.

## License

Apache License 2.0, just like Spring Boot

**[Back to top](#table-of-contents)**
