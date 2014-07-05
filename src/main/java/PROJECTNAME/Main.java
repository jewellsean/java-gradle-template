package PROJECTNAME;



public class Main implements Runnable
{

  
  public static void main(String [] args)
  {
    
  }

  /**
   * # PROJECTNAME
   * 
   * Installing from source
   * ----------------------
   * 
   * Requires: gradle, git, eclipse
   * 
   * - Clone the repository
   * - Type ``gradle eclipse`` from the root of the repository
   * - From eclipse:
   *   - ``Import`` in ``File`` menu
   *   - ``Import existing projects into workspace``
   *   - Select the root of the newly created repo
   *   - Deselect ``Copy projects into workspace`` to avoid having duplicates
   * - You can call PROJECTNAME.Main from the command line via ``./PROJECTNAME``
   *   - Move the executable ``PROJECTNAME`` to a PATH folder (or add this folder to PATH)
   *   to have access from anywhere
   *   - Changes done via eclipse will be reflected right away
   */
  @Tutorial(startTutorial = "README.md", showSource = false)
  @Override
  public void run()
  {
  }
}