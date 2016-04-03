This is a project that demonstrate the feasibility of repairing program with semantic code search.

# Dependencies

In executors/, there exist several several compiled utilities that are called by the Java program.  Update z3, gcc and gdb to point to your local versions/binaries (symlinks should work fine).  pathgen and transform are produced by the OCaml code in the supportive associated repository SearchRepair-SymEx (https://github.com/ProgramRepair/SearchRepair-SymEx).  

# Running

Let PROJECTROOT denotes the root directory of this project

Several things to setup and rerun:

1. Firstly, switch to yalin branch for this project.

2. Secondly, import this project in Eclipse

3. Install python, mysql, z3, z3 ocaml api, jdk, gcc in local computer.
4. If folder "./bughunt" exists,  delete that folder.

5. Create a database in mysql, and go to PROJECTROOT/configuration/configuration file, edit three fields user, password, database:
	
	user:root
	
	password:3125703
	
	database:test
	
	NOTE: please set the actual values of these three fields in your local computer. Above are the mysql setting in one author yalin's computer.

6. Go to PROJECTROOT/src/test/main.java, run the main function of that java file, then the experiments will be re run. IMPORTANT: if there were a lot of running time IO exceptions being printing out at console in the beginning, this is probably because C program can not be compiled by GCC in java.   This problem might happen a minute after starting rerun experiment. If it did happen, delete "./bughunt" and rerun this experiments. Usually a second rerun will be successful. A successful sign of this is that, the console is printing a list of name of directories, which are the directories of every version in IntroClass folder.
After the experiments are completed, a csv file  PROJECTROOT/csvlog/log will be generated, which contains all of data presented in the paper.
 
6. notice that, there are four fields in the main function of PROJECTROOT/src/test/main.java, which are:

	Field 1: repositoryType. repositoryType=0 means search repository built by linux, 
		repositoryType=1 means search repository built by introclass, 
		repositoryType=2 means search repository by old versions and other students' submissions.
		
	Field 2: operation. operation=1 means rerun the experiments, 
		operation=0 means generating csvData using existing results. 
		I have backed up my results in case you wants the csv data without rerun the whole project
		
	Field 3: wb. wb=false, means rerun bb testcases, evaluating on wb.
		wb=true, means rerun wb testcases, evaluating on bb.

        Field 4: introclasspath. which is the absolute path of introclass benchmark set. When new versions are added
                in introclass set, please empty the folder PROJECTROOT/bughunt, deleting all of subfolders and files 
                in PROJECTROOT/bughunt but keep bughunt folder. Just make it empty. Then set introclasspath to the
                absolute path of the new introclass.
		
NOTICE: rerun experiments on syllables versions takes a lot of time.
