package www.google.com.digitalbuildings._0_0_1.fields;

import org.eclipse.rdf4j.model.IRI;
import java.util.Set;
import www.google.com.digitalbuildings._0_0_1.subfields.IBypass;
import www.google.com.digitalbuildings._0_0_1.subfields.ICommand;
import www.google.com.digitalbuildings._0_0_1.subfields.IPercentage;
import www.google.com.digitalbuildings._0_0_1.subfields.IAir;
import www.google.com.digitalbuildings._0_0_1.subfields.IDamper;

public interface IBypass_air_damper_percentage_command_2 extends IField{

	public IRI iri();

    public void addComposedOfAir (IAir parameter);

	public Set<IAir> getComposedOfAir();

    public void addComposedOfBypass (IBypass parameter);

	public Set<IBypass> getComposedOfBypass();

    public void addComposedOfCommand (ICommand parameter);

	public Set<ICommand> getComposedOfCommand();

    public void addComposedOfDamper (IDamper parameter);

	public Set<IDamper> getComposedOfDamper();

    public void addComposedOfPercentage (IPercentage parameter);

	public Set<IPercentage> getComposedOfPercentage();

}