DB Inheritance type: Using @MappedSuperClass

- In this no table is created for parent class ( In this case BaseUser)
- One table is created for each child class which will include attributes from the parents class as well.

Pro:
- Clearer : the code is cleaner
- Queries will be simpler

Cons:
- Parent's data cannot be stored separately.