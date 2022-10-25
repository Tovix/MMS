// description: class representing drums and all it's properties (sub class for instrument).

// OOP principals applied: encapsulation appears in the objects created,
// inheritance also appears in this class as this class acts as a subclass to the parent class
// instruments, polymorphism appears in method overriding.

public class drums extends Instruments
{
    private String drumMaterial;
    private int drumThickness;

    public drums()
    {

    }

    public drums(int instrument_id, String instrument_model,
                 String instrument_type, float instrument_price, int soldInstruments,
                 int instrumentsInStock, String drumMaterial, int drumThickness)
    {
        super(instrument_model, instrument_id, instrument_type,  instrument_price,
                soldInstruments, instrumentsInStock);
        this.drumMaterial = drumMaterial;
        this.drumThickness = drumThickness;
    }

    public String getDrumMaterial()
    {
        return drumMaterial;
    }

    public void setDrumMaterial(String drumMaterial)
    {
        this.drumMaterial = drumMaterial;
    }

    public int getDrumThickness() {
        return drumThickness;
    }

    public void setDrumThickness(int drumThickness)
    {
        this.drumThickness = drumThickness;
    }

    @Override
    public void setInstrument_model(String instrument_model) {
        super.setInstrument_model(instrument_model);
    }

    @Override
    public void setInstrument_id(int instrument_id) {
        super.setInstrument_id(instrument_id);
    }

    @Override
    public void setInstrument_type(String instrument_type) {
        super.setInstrument_type(instrument_type);
    }

    @Override
    public void setInstrument_price(float instrument_price) {
        super.setInstrument_price(instrument_price);
    }

    @Override
    public String getInstrument_model() {
        return super.getInstrument_model();
    }

    @Override
    public int getInstrument_id() {
        return super.getInstrument_id();
    }

    @Override
    public String getInstrument_type() {
        return super.getInstrument_type();
    }

    @Override
    public float getInstrument_price() {
        return super.getInstrument_price();
    }

    @Override
    public int getSoldInstruments() {
        return super.getSoldInstruments();
    }

    @Override
    public void setSoldInstruments(int soldInstruments) {
        super.setSoldInstruments(soldInstruments);
    }

    @Override
    public int getInstrumentsInStock() {
        return super.getInstrumentsInStock();
    }

    @Override
    public void setInstrumentsInStock(int instrumentsInStock) {
        super.setInstrumentsInStock(instrumentsInStock);
    }
}
