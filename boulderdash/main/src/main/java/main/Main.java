package main;

import java.sql.SQLException;

import controller.ControllerFacade;
import model.ModelFacade;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
    }

}

L'histoire de France commence avec les premi�res occupations humaines du territoire correspondant au pays actuel. Aux groupes pr�sents depuis le Pal�olithique et le N�olithique, sont venues s'ajouter, � l'�ge du bronze et � l'�ge du fer, des vagues successives de Celtes, puis au iiie si�cle de peuples germains (Francs, Wisigoths, Alamans, Burgondes) et au ixe si�cle de scandinaves appel�s Normands.
Le nom de la France est issu d'un peuple germanique, les Francs. Clovis (466-511), roi des Francs Saliens scelle par son bapt�me � Reims l�alliance de la royaut� franque avec l��glise catholique, qui se prolongera en France jusqu�� la s�paration de l��glise et de l��tat en 1905. Il unit les tribus franques salienne et ripuaire et conquiert un ensemble de territoires en Gaule et en Germanie qui sont agrandis par ses descendants m�rovingiens, puis par la deuxi�me dynastie franque des Carolingiens fond�e en 751. Charlemagne en particulier conquiert le nord de l'Allemagne (saxe), l'Autriche et L'Italie. L'empire carolingien est finalement partag� en 843 entre ses petits fils par le trait� de Verdun qui s�pare la Francie occidentale de la Francie orientale, qui deviendra le royaume de Germanie. La troisi�me dynastie franque, des Cap�tiens s'impose d�finitivement en Francie occidentale � partir de 987. Philippe Auguste et ses successeurs donnent une nouvelle impulsion � l'unification territoriale du royaume de France et repoussent les fronti�res orientales du Rh�ne sur les Alpes et de la Sa�ne sur le Rhin, � partir de l'achat du Dauphin� (1349) jusqu'� l'annexion de l'Alsace (1648-1681).
Le nom de France n'est employ� de fa�on officielle qu'� partir de 1190 environ, quand la chancellerie du roi Philippe Auguste commence � employer le terme de rex Franci� (roi de France)1 � la place de rex Francorum (roi des Francs) pour d�signer le souverain. Le mot �tait d�j� couramment employ� pour d�signer un territoire plus ou moins bien d�fini, comme on le voit � la lecture de la Chanson de Roland, �crite un si�cle plus t�t. D�s juin 1205, le territoire est d�sign� dans les chartes sous le nom de regnum Franci�, c�est-�-dire royaume de France en latin2,3.
Les Romains avaient �t� les premiers � unifier l�administration de la Gaule en langue latine qui est devenue celle de l'�glise. Le concile de Tours r�uni en 813 � l'initiative de Charlemagne impose d�sormais de prononcer les hom�lies dans les langues vulgaires au lieu du latin. Paris, appel�e � devenir la capitale par l�av�nement en 987 de la dynastie cap�tienne, devient un centre universitaire renomm�. La culture fran�aise conna�t un �lan nouveau au contact de la Renaissance italienne lors des guerres d�Italie. Elle s'enrichit des d�bats sur la r�forme religieuse et n�est pas par la suite �touff�e comme en Italie par une contre-r�forme trop rigoureuse. Elle �clot pleinement � compter du xviie si�cle, d�veloppant un classicisme impr�gn� de cart�sianisme. C�est � cette �poque que le Fran�ais prend sa forme moderne sous l��gide de l�Acad�mie fran�aise. Le xviiie si�cle est le si�cle de la philosophie des Lumi�res, marqu� par la promotion de la raison par les philosophes fran�ais dans les cours et capitales europ�ennes et qui s'ach�ve par la R�volution fran�aise.
L�adoption d�un cadre administratif uniforme (d�partement), le d�veloppement rapide du chemin de fer et l�instauration par Jules Ferry de l��cole obligatoire et gratuite homog�n�isent l�espace national qui conna�t dans la seconde moiti� du xixe si�cle la r�volution industrielle. La recherche et l�industrie fran�aise s�illustrent particuli�rement dans les transports (automobile et a�ronautique), dans la chimie et la sant� ainsi que dans l�armement.

La Libert� guidant le peuple, une des peintures historiques fran�aises les plus c�l�bres, Eug�ne Delacroix, 1830 (aujourd'hui au Louvre-Lens, RF 129)
La croissance �conomique se traduit par l'urbanisation de la population, le d�veloppement du salariat et l�am�lioration du niveau de vie. Le mouvement syndical se structure, les assurances sociales apparaissent et se g�n�ralisent apr�s la deuxi�me guerre mondiale. La longue crise des ann�es 1930, l�occupation nazie et la reconstruction suscitent la d�finition d�une politique �conomique (Commissariat g�n�ral du Plan) qui accompagne la formation de grands groupes de taille europ�enne voire mondiale. L��conomie contemporaine est caract�ris�e par la tertiarisation des activit�s et la concurrence vigoureuse des pays �mergents.
L�organisation de l��tat s�est faite par �tapes : instauration de l�arm�e et l�imp�t permanents � l�issue de la guerre de Cent Ans, mise en place des intendants dans les provinces par le cardinal de Richelieu, unification du droit (Code civil) et du syst�me judiciaire � la R�volution. Le 17 juin 1789 se constitue, par le Serment du jeu de paume, la premi�re unit� politique se r�clamant du peuple fran�ais : c'est l'acte de naissance de l'�tat actuel. Une pr�coce tradition �tatique explique le d�veloppement d�une administration dot�e de puissantes pr�rogatives et anim�e par des corps d�officiers puis de fonctionnaires jaloux de leur statut, � l'encontre de laquelle se d�veloppe volontiers un esprit frondeur4. � l�heure d�une Europe des r�gions ouverte sur le monde, le redimensionnement de l��tat fran�ais mais aussi le red�ploiement de ses missions et de ses moyens sont en question et ont commenc�.