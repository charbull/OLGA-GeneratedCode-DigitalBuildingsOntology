package www.google.com.digitalbuildings._0_0_1.fields;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import www.google.com.digitalbuildings._0_0_1.subfields.IMode;
import www.google.com.digitalbuildings._0_0_1.subfields.Mode;
import www.google.com.digitalbuildings._0_0_1.subfields.IRun;
import www.google.com.digitalbuildings._0_0_1.subfields.Run;


@SuppressWarnings("serial")
public class Run_mode extends www.google.com.digitalbuildings._0_0_1.fields.Field implements IRun_mode{

	IRI newInstance;
	public Run_mode(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/fields#Run_mode"));
	}

	public IRI iri()
	{
		return newInstance;
	}


  public void addComposedOfMode (IMode parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), parameter);
	}

	public Set<IMode> getComposedOfMode (){
		Set<IMode> ComposedOfMode = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), null)
		.objects().forEach(action->{
			if(action instanceof Mode) {
				ComposedOfMode.add((Mode)action);
			}
		});
		return ComposedOfMode;
	}


  public void addComposedOfRun (IRun parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), parameter);
	}

	public Set<IRun> getComposedOfRun (){
		Set<IRun> ComposedOfRun = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), null)
		.objects().forEach(action->{
			if(action instanceof Run) {
				ComposedOfRun.add((Run)action);
			}
		});
		return ComposedOfRun;
	}

	public static Set<IRun_mode> getAllRun_modesObjectsCreated(){
		Set<IRun_mode> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/fields#Run_mode")).subjects().stream()
		.map(mapper->(IRun_mode)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}