package www.google.com.digitalbuildings._0_0_1.fields;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import www.google.com.digitalbuildings._0_0_1.subfields.ISpeed;
import www.google.com.digitalbuildings._0_0_1.subfields.Speed;
import www.google.com.digitalbuildings._0_0_1.subfields.IFan;
import www.google.com.digitalbuildings._0_0_1.subfields.Fan;
import www.google.com.digitalbuildings._0_0_1.subfields.ICommand;
import www.google.com.digitalbuildings._0_0_1.subfields.Command;
import www.google.com.digitalbuildings._0_0_1.subfields.IPercentage;
import www.google.com.digitalbuildings._0_0_1.subfields.Percentage;
import www.google.com.digitalbuildings._0_0_1.subfields.ISupply;
import www.google.com.digitalbuildings._0_0_1.subfields.Supply;


@SuppressWarnings("serial")
public class Supply_fan_speed_percentage_command extends www.google.com.digitalbuildings._0_0_1.fields.Field implements ISupply_fan_speed_percentage_command{

	IRI newInstance;
	public Supply_fan_speed_percentage_command(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/fields#Supply_fan_speed_percentage_command"));
	}

	public IRI iri()
	{
		return newInstance;
	}


  public void addComposedOfCommand (ICommand parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), parameter);
	}

	public Set<ICommand> getComposedOfCommand (){
		Set<ICommand> ComposedOfCommand = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), null)
		.objects().forEach(action->{
			if(action instanceof Command) {
				ComposedOfCommand.add((Command)action);
			}
		});
		return ComposedOfCommand;
	}


  public void addComposedOfFan (IFan parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), parameter);
	}

	public Set<IFan> getComposedOfFan (){
		Set<IFan> ComposedOfFan = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), null)
		.objects().forEach(action->{
			if(action instanceof Fan) {
				ComposedOfFan.add((Fan)action);
			}
		});
		return ComposedOfFan;
	}


  public void addComposedOfPercentage (IPercentage parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), parameter);
	}

	public Set<IPercentage> getComposedOfPercentage (){
		Set<IPercentage> ComposedOfPercentage = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), null)
		.objects().forEach(action->{
			if(action instanceof Percentage) {
				ComposedOfPercentage.add((Percentage)action);
			}
		});
		return ComposedOfPercentage;
	}


  public void addComposedOfSpeed (ISpeed parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), parameter);
	}

	public Set<ISpeed> getComposedOfSpeed (){
		Set<ISpeed> ComposedOfSpeed = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), null)
		.objects().forEach(action->{
			if(action instanceof Speed) {
				ComposedOfSpeed.add((Speed)action);
			}
		});
		return ComposedOfSpeed;
	}


  public void addComposedOfSupply (ISupply parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), parameter);
	}

	public Set<ISupply> getComposedOfSupply (){
		Set<ISupply> ComposedOfSupply = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), null)
		.objects().forEach(action->{
			if(action instanceof Supply) {
				ComposedOfSupply.add((Supply)action);
			}
		});
		return ComposedOfSupply;
	}

	public static Set<ISupply_fan_speed_percentage_command> getAllSupply_fan_speed_percentage_commandsObjectsCreated(){
		Set<ISupply_fan_speed_percentage_command> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/fields#Supply_fan_speed_percentage_command")).subjects().stream()
		.map(mapper->(ISupply_fan_speed_percentage_command)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}