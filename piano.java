// description: class representing piano and all it's properties (sub class for instrument).

// OOP principals applied: encapsulation appears in the objects created,
// inheritance also appears in this class as this class acts as a subclass to the parent class
// instruments, polymorphism appears in method overriding.


public class piano extends Instruments
{
    private int numberOfKeys;
    private String keysMaterials;

    public piano()
    {

    }

    public piano(String instrument_name, int instrument_id,
                 String instrument_type,int soldInstruments,
                 int instrumentsInStock, float instrument_price, int numberOfKeys,
                 String keysMaterials)
    {
        super(instrument_name, instrument_id, instrument_type,  instrument_price, soldInstruments, instrumentsInStock);
        this.numberOfKeys = numberOfKeys;
        this.keysMaterials = keysMaterials;
    }
    public int getNumberOfKeys()
    {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys)
    {
        this.numberOfKeys = numberOfKeys;
    }

    public String getKeysMaterials()
    {
        return keysMaterials;
    }

    public void setKeysMaterials(String keysMaterials)
    {
        this.keysMaterials = keysMaterials;
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
}
