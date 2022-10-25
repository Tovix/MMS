// description: class representing instruments and all it's properties (Parent for drums and piano classes).

// OOP principals applied: encapsulation appears in the objects created,
// inheritance also appears in this class as this class acts as a parent class for both of (drums, piano)
// instruments, abstraction appears as the class is created to only act as a parent class (abstract)
// and creating an object from it cannot be done.

public abstract class Instruments
{


    private String instrument_model;
    private int instrument_id;
    private String instrument_type;
    private float instrument_price;
    private int soldInstruments;
    private int instrumentsInStock;

    public Instruments()
    {

    }

    public Instruments(String instrument_model, int instrument_id,
                       String instrument_type, float instrument_price, int soldInstruments, int instrumentsInStock)
    {
        this.instrument_model = instrument_model;
        this.instrument_id = instrument_id;
        this.instrument_type = instrument_type;
        this.instrument_price = instrument_price;
        this.soldInstruments = soldInstruments;
        this.instrumentsInStock = instrumentsInStock;
    }

    public void setInstrument_model(String instrument_model)
    {
        this.instrument_model = instrument_model;
    }

    public void setInstrument_id(int instrument_id)
    {
        this.instrument_id = instrument_id;
    }

    public void setInstrument_type(String instrument_type)
    {
        this.instrument_type = instrument_type;
    }

    public void setInstrument_price(float instrument_price)
    {
        this.instrument_price = instrument_price;
    }

    public String getInstrument_model()
    {
        return instrument_model;
    }

    public int getInstrument_id()
    {
        return instrument_id;
    }

    public String getInstrument_type()
    {
        return instrument_type;
    }

    public float getInstrument_price()
    {
        return instrument_price;
    }

    public int getSoldInstruments()
    {
        return soldInstruments;
    }

    public void setSoldInstruments(int soldInstruments)
    {
        this.soldInstruments = soldInstruments;
    }

    public int getInstrumentsInStock() {
        return instrumentsInStock;
    }

    public void setInstrumentsInStock(int instrumentsInStock)
    {
        this.instrumentsInStock = instrumentsInStock;
    }



}