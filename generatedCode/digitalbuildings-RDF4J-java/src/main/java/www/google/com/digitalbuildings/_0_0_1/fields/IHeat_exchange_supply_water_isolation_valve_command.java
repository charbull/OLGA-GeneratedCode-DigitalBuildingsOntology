package www.google.com.digitalbuildings._0_0_1.fields;

import org.eclipse.rdf4j.model.IRI;
import java.util.Set;
import www.google.com.digitalbuildings._0_0_1.subfields.IExchange;
import www.google.com.digitalbuildings._0_0_1.subfields.IWater;
import www.google.com.digitalbuildings._0_0_1.subfields.IHeat;
import www.google.com.digitalbuildings._0_0_1.subfields.ICommand;
import www.google.com.digitalbuildings._0_0_1.subfields.ISupply;
import www.google.com.digitalbuildings._0_0_1.subfields.IIsolation;
import www.google.com.digitalbuildings._0_0_1.subfields.IValve;

public interface IHeat_exchange_supply_water_isolation_valve_command extends IField{

	public IRI iri();

    public void addComposedOfCommand (ICommand parameter);

	public Set<ICommand> getComposedOfCommand();

    public void addComposedOfExchange (IExchange parameter);

	public Set<IExchange> getComposedOfExchange();

    public void addComposedOfHeat (IHeat parameter);

	public Set<IHeat> getComposedOfHeat();

    public void addComposedOfIsolation (IIsolation parameter);

	public Set<IIsolation> getComposedOfIsolation();

    public void addComposedOfSupply (ISupply parameter);

	public Set<ISupply> getComposedOfSupply();

    public void addComposedOfValve (IValve parameter);

	public Set<IValve> getComposedOfValve();

    public void addComposedOfWater (IWater parameter);

	public Set<IWater> getComposedOfWater();

}