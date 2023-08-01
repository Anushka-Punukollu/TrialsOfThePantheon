/**
 * CPT NAME: TRIALS OF THE PANTHEON  
 * NAMES: ANUSHKA PUNUKOLLU
 * TEACHER: MR. CONWAY 
 * COURSE CODE: ICS3U1
 * DATE: JUNE 9, 2023
 * 
 * GAME DESCRIPTION: Welcome to the Trials of the Pantheon, a Greek mythology based game that has 2 levels, where the player/user 
 * is a demigod assigned a quest from the goddess Athena to retrieve a key object that can stop the brewing war on Olympus! You 
 * will need to battle 42 of Medusa's snakes and solve 4 intricate puzzles that will test your knowledge and thinking skills. 
 * Embark on an epic adventure filled with challenges, puzzles, and battles as you journey through two thrilling levels. Prepare 
 * yourself, demigod, for the challenges that await you. The fate of the world rests in your hands. Can you overcome the snakes, 
 * solve the puzzles, and fulfill your quest?
 * 	
 * OBJECTIVES: 
 * LEVEL 1 OBJECTIVE: In the first level of the game, the player will see snakes that they will have to defeat. In this level, 
 * the player must get 42 kills in order to advance to the second level. Snakes die by the player pressing space and hitting it with the sword. 
 * This level uses the Camera movement to allow for a more professionally and game like feel. There is a private class within the main class to 
 * access the camera coordinates. The enemies randomly spawn" without using a separate timer because they come in "infinitely" due to the 7 enemies 
 * health consistently resetting and they follow the player. After defeating 42 enemies the player is transported to the center of the game scene 
 * with the statue, then they will get a JOption Pane prompt to congratulate them and ask for their name. Once it is done, the player is transported 
 * to the Labyrinth (maze level - 2nd level). 
 * 
 * LEVEL 2 OBJECTIVE: In this level, they player must navigate a maze ("The Labyrinth") and the player must solve a series of puzzles that are related to key
 * figures of the game (Athena, Minotaurs, etc) that are posed to them by 4 NPCs. They get 3 chances to answer correctly, if they cannot answer it then they 
 * are exited from the game. If the player answers the final question correctly, then the chest in the center opens in which the player can finally go to collect 
 * the item that Athena demanded them to retrieve as a part of their quest. Ends off with a thank you JOption Pane and talks about "seeing them next time". 
 * 
 * CONTROL MOVEMENTS:
 * 
 * W - Player moves up
 * A - Player moves left
 * S - Player moves down
 * D - Player moves right
 * SPACE - Player can attack with the Sword to kill the snakes
 * 
 * CONCEPT CHECKLIST:
 * 
 * Camera Movement - The private Camera class within the main class has four instance variables: x, y, width, and height. These variables represent the position and dimensions of the camera.
					 It has a constructor that initializes the camera's position and dimensions based on the provided arguments (x, y, width, and height). The update method of the Camera 
					 class is responsible for updating the camera's position based on the player's position and the frame dimensions.  It takes the player's X and Y coordinates, as well as the 
					 width and height of the frame. Inside the update method, the new camera position (newCameraX and newCameraY) is calculated based on the player's position. The camera is 
					 centered around the player by subtracting half of the frame's width and height from the player's coordinates. The calculated newCameraX and newCameraY are then checked against 
					 the boundaries of the game scene to ensure that the camera doesn't go beyond the scene's edges. Finally, the camera's position (x and y) is updated with the new camera position. 
					 The getX and getY methods in the Camera class provide access to the current camera position. In my code, the camera's update method is called inside the game loop to ensure that 
					 the camera follows the player's movements. The camera's position is then used to adjust how the game scene looks and the player's position on the screen. By updating the camera's 
					 position based on the player's movements, only part of the game scene is displayed, creating the effect of a moving camera. Since the camera is closely related to the main class and primarily used within it, 
					 I put the class within the main class itself instead of making a separate one (this helped me navigate and group my code better when building out the rest of the game).
 *		Links Used to Learn:
 * 			 - https://www.youtube.com/watch?v=48bXkCemgB8&t=233s (most used and best tutorial)
 * 			 - https://www.youtube.com/watch?v=vdcOIwkB6dA
 * 			 - https://www.youtube.com/watch?v=Ny_YHoTYcxo
 * 			 - https://www.youtube.com/watch?v=2bP3TvURM04
 *
 * Input/Output - The player is asked for their name and this is later used in the game to name them. Also shown when the player
 * 				  is asked for their answers to the 4 puzzles, depending on if they got the answer right/wrong they are either able to continue or exit.		
 * 
 * IF statements - Used basically everywhere in the program, most important was with boundaries in the maze, change scenes, stop enemy count, check for 
 * 				   collisions with enemies, etc, etc. Seen in lines 222, 238, 248, etc.
 * 
 * Random Numbers - Used to randomly generate the enemy's position (Ex: lines 234 & 366) also used in the enemy class for the enemy's speed
 * 
 * Two (2) different arrays - String Array for player options (Line: 441) and array's used many times for Enemy array of objects (Line: 182, 228, etc)
 * 
 * Self-made method in the main program - TitleChanger method helps check if the player/user clicks the title screen, where they click (on play or exit) 
 * 								          and what image to show (intrusction, story, courtyard, etc) or to exit. (Starts Line: 871)
 * 
 * Additional class - There are 4 other classes outside of main including: NPC_Interactions, Enemy, Player, and the StringNumber class.
 * 
 * JOptionPane - Used to display the NPC's questions and ask user for name + display messages (throughout the program)
 * 
 * Animations - Used animations/JFrames with the player throughout the game, etc
 * 
 * Collision - Checks collision for maze boundaries, enemy, swords, player, etc (First Seen Lines: 277) - The best 
 * 			   display of collision was for maze boundaries since that took the most time and rectangle bounds all had to be organized
 * 			   precisely. (NOTE: in the maze the last floating block in down corner is intentionally left without a mask)
 *  
 * Sound - Added sound to the game in lines 136 - 149 and made it play continuously throughout the game
 * 
 * REGEX - Used in line 614 to check if the player inputs the proper answer for the riddle (since the answer is numerical .matches made the most sense)
 * 
 * 2 Types of Loops: 
 *  - For loop in the enemy masks, enemy following the player, etc. used frequently throughout 
 *  - While Loop in checking the player answers for riddles and displaying the riddles in the first place
 *    when the player intersects with an NPC (First Seen Line: 487)
 * 
 * String Class methods - Used in the StringNumber class including the .charAt + .length to determine the number combo for the riddle (find the answer) It was done in 
 * 						  another class to clean up the code and if I wanted to change the question in the future/add one similar to that I can just use that class/add on to it
 * 						  instead of redoing all of it.
 * 
 * Try-Catch statements - The try-catch is used at the start of the program to ensure that the music will play throughout the program (Line: 139)
 * 
 * 
 * PUZZLES ANSWER KEY
 * 	1. minotaur (same spelling, caps/no caps doesn't matter) 
 * 	2. Athena (same spelling, caps/no caps doesn't matter) 
 * 	3. 72747423
 * 	4. echo (same spelling, caps/no caps doesn't matter) 
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Random;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class PantheonLevel extends JPanel implements ActionListener, KeyListener, MouseListener {

	// MUSIC
	private static Clip Music;

	// Player + NPC Interactions objects
	private Player player;
	private NPC_Interactions inter;
	private StringNumber string;

	private Camera camera;

	private boolean gameRun, left, right, up, down, attack, scene1, npcStart, npc1show, npc2show, npc3show, npc4show;

	private int health, wrongAnsCount4, wrongAnsCount3, wrongAnsCount2, wrongAnsCount1, titleInterface = 0, enemyKills,
			event = 1, scene, counter, chestCounter;

	private Random rand;

	private ImageIcon titleScreen, loseImg, gameScene, swordImg;

	private Enemy[] enemy;

	private String name;

	private Rectangle2D[] masks;
	private Rectangle2D hit, sword, npc1, playerMask, npc2, npc3, npc4;

	private Timer playerTimer, kill, reset;

	private JFrame frame;

	public static void main(String[] args) {

		// Calling the constructor
		new PantheonLevel();
	}

	// CONSTRUCTOR
	public PantheonLevel() {

		// Initialize other classes
		player = new Player();
		inter = new NPC_Interactions();
		string = new StringNumber();

		//MUSIC
		try
		{
			// Load the game music file
			File gameMusic = new File("GameMusic.wav");
			AudioInputStream audioIn2 = AudioSystem.getAudioInputStream(gameMusic);

			// Create an audio clip for the music and set it to loop continuously
			Music = AudioSystem.getClip();
			Music.loop(Clip.LOOP_CONTINUOUSLY);

			// Open the audio input stream and start playing the music
			Music.open(audioIn2);
			Music.start(); 
		}

		catch(Exception e)
		{
			// Display an error message if the music file is not found
			JOptionPane.showMessageDialog(null, "File not Found");
		}

		// Create a random number generator
		rand = new Random();

		// Load images and icons
		titleScreen = new ImageIcon("Interfaces/TitleScreen0.png");
		loseImg = new ImageIcon("Interfaces/GameOver.png");
		gameScene = new ImageIcon("Interfaces/GameScene" + scene + ".png");
		swordImg = new ImageIcon("Player/Sword.png");

		// Initialize variables with start values
		health = 100;
		enemyKills = 0;
		scene = 1;
		counter = 0;
		wrongAnsCount4 = 0;
		wrongAnsCount3 = 0;
		wrongAnsCount2 = 0;
		wrongAnsCount1 = 0;
		chestCounter = 0;

		// Set enemy array and the game masks
		enemy = new Enemy[7];
		masks = new Rectangle2D[7];
		hit = new Rectangle2D.Double(0, 0, player.getImage().getIconWidth(), player.getImage().getIconHeight());
		sword = new Rectangle2D.Double(0, 0, 0, 0);

		// Initalize booleans (flags)
		gameRun = false;
		left = false;
		right = false;
		up = false;
		down = false;
		scene1 = true;
		attack = false;
		npcStart = false;
		npc1show = false;
		npc2show = false;
		npc3show = false;
		npc4show = false;

		//Initialize player, kill, and reset timers
		playerTimer = new Timer(50, this);
		kill = new Timer(1250, this);
		reset = new Timer(200, this);

		// Set up input listeners for keyboard and mouse events
		addKeyListener(this);
		addMouseListener(this);

		setFocusable(true);
		requestFocus();		
		setLayout(null);

		// Create and configure the game frame
		frame = new JFrame();
		frame.setSize(800, 800);
		frame.setContentPane(this);
		frame.setTitle("Trials of The Pantheon");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		// Create the camera object
		camera = new Camera(0, 0, frame.getWidth(), frame.getHeight());

		// If it's the first scene (scene1 == true)
		if (scene1 == true) 
		{
			for (int i = 0; i < enemy.length; i++) 
			{
				// Initialize enemy objects and randomize their locations
				enemy[i] = new Enemy();
				enemy[i].setLocation(rand.nextInt(750), rand.nextInt(750));
			}
		}

		// Make the game frame visible
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == playerTimer) 
		{
			//Set draw and gameRun flags to true when the playerTimer is running
			gameRun = true;

			// If in the first part of the game (courtyard scene) then these are the conditions for player movement
			if (scene == 1) 
			{
				// Move the player up by 10
				if (up) 
				{
					player.moveUp(10);
				} 

				// Move the player down by 10
				else if (down) 
				{
					player.moveDown(10);
				} 

				// Move the player left by 10
				else if (left) 
				{
					player.moveLeft(10);
				} 

				// Move the player right by 10
				else if (right) 
				{
					player.moveRight(10);
				}
			}

			//If event == 3 (basically if in the maze portion of the game) then these are the conditions for player movement
			else if (event == 3) 
			{
				// Player movement with collision checks for maze scenes
				// Up movement (as long as the player doesn't intersect with the maze boundaries)
				if (up && !playerMask.intersects(inter.upBounds()) && !playerMask.intersects(inter.upBounds3Pt2())
						&& !playerMask.intersects(inter.upBounds2Pt2()) && !playerMask.intersects(inter.downBounds())
						&& !playerMask.intersects(inter.rightBounds())) 
				{
					player.moveUp(10);
				}

				// Down movement (as long as the player doesn't intersect with the maze boundaries)
				if (down  && !playerMask.intersects(inter.upBounds2()) && !playerMask.intersects(inter.downBounds2()) 
						&& !playerMask.intersects(inter.downBoundsPt2()) && !playerMask.intersects(inter.upBounds3Pt2()) 
						&& !playerMask.intersects(inter.upBounds3())) 
				{
					player.moveDown(10);
				}

				// Left movement (as long as the player doesn't intersect with the maze boundaries)
				if (left && !playerMask.intersects(inter.leftBounds1()) && !playerMask.intersects(inter.leftBounds3Pt2())
						&& !playerMask.intersects(inter.leftBounds2Pt2()) && !playerMask.intersects(inter.rightBounds2())
						&& !playerMask.intersects(inter.rightBounds()) && !playerMask.intersects(inter.rightBoundsPt2())) 
				{
					player.moveLeft(10);
				}

				// Right movement (as long as the player doesn't intersect with the maze boundaries)
				if (right  && !playerMask.intersects(inter.rightBounds3()) 
						&& !playerMask.intersects(inter.leftBounds2()) && !playerMask.intersects(inter.rightBounds2Pt2())
						&& !playerMask.intersects(inter.leftBounds3())) 
				{
					player.moveRight(10);
				}

			}

			// Ensure the player stays within the game scene boundaries
			if (player.getX() < 0) 
			{
				player.setX(0);
			} 
			else if (player.getX() > gameScene.getIconWidth() - player.getWidth()) 
			{
				player.setX(gameScene.getIconWidth() - player.getWidth());
			}

			if (player.getY() < 0) 
			{
				player.setY(0);
			} 
			else if (player.getY() + 50 > gameScene.getIconHeight() - player.getHeight()) 
			{
				player.setY(gameScene.getIconHeight() - player.getHeight() - 50);
			}

			if (scene1 == true) 
			{
				// Move enemies towards the player
				for (int i = 0; i < enemy.length; i++) 
				{
					// Set enemy movement direction based on player position
					if (player.getX() <= enemy[i].getX()) 
					{
						enemy[i].setX("left");
					} 
					else if (player.getX() >= enemy[i].getX()) 
					{
						enemy[i].setX("right");
					}

					if (player.getY() <= enemy[i].getY()) 
					{
						enemy[i].setY("up");
					} 
					else if (player.getY() >= enemy[i].getY()) 
					{
						enemy[i].setY("down");
					}

					if (enemy[i].enemyHealth() > 0) 
					{
						masks[i] = enemy[i].mask(camera.getX(), camera.getY());
					} 
					else 
					{
						enemy[i].resetHealth();
						enemy[i].setLocation(rand.nextInt(801), rand.nextInt(801));
						enemyKills++;
					}

					// Set the sword to player's hand when attacking or reset it when not attacking
					if (attack) 
					{
						sword = new Rectangle2D.Double(player.getX() - camera.getX(), player.getY() - camera.getY(), 50, 75);
					} 
					else 
					{
						sword = new Rectangle2D.Double(0, 0, 0, 0);
					}

					/// if the player intersects with one of the snakes, start the kill timer or if
					/// they don't then reduce player health by 2
					if (hit.intersects(masks[i])) 
					{
						if (attack) 
						{
							kill.start();
						} 
						else 
						{
							health -= 2;
						}
					}

					// Check for collisions between sword and enemies (if it does intersect then reduce the enemies health)
					if (sword.intersects(masks[i])) 
					{
						enemy[i].decreaseHealth();
					}


					if (e.getSource() == kill) 
					{
						for (i = 0; i < masks.length; i++) 
						{
							// Check if the player htis (swords) intersects with an enemy
							if (hit.intersects(masks[i])) 
							{
								//Increase enemy kills
								enemyKills++;
								//Stop the kill timer
								kill.stop();
							}
						}
					}

					// Stop sword animation after reset timer (gives it a break before attacking again and basically "reset")
					if (e.getSource() == reset) 
					{
						attack = false;
						reset.stop();
					}

				}

				// Scene transition and event trigger (if the player kills 42 enemies then they move onto the next level)
				if (enemyKills == 42 && event == 1) 
				{
					//Set variables to new values now
					health = 100;
					event = 2;
					counter = 1;
					scene1 = false;
					npcStart = true;
				}

				if (counter == 1) 
				{
					//String array with player's options of if they want to continue or not
					String[] options = { "YES", "NO" };

					ImageIcon scene1Guardian = new ImageIcon("Guardian.png");

					int selectedOption = JOptionPane.showOptionDialog(null,
							"CONGRATULATIONS DEMIGOD YOU HAVE KILLED ALL " + enemyKills
							+ " OF MEDUSA's OFFSPRING! \nHOWEVER, WE HAVE ANOTHER ISSUE... Are YOU READY?",
							"PART 1: Congrats", JOptionPane.DEFAULT_OPTION, 0, null, options, null);


					if (selectedOption == 0) 
					{
						// Player selected "YES" then do this
						name = JOptionPane.showInputDialog(null, "PERFECT! \nNow what is your name brave demigod?",
								"A New Journey", JOptionPane.QUESTION_MESSAGE);

						JOptionPane.showMessageDialog(null, "Hello there " + name + "!! \nThe labryinth awaits you...", 
								"A New Journey", JOptionPane.PLAIN_MESSAGE, scene1Guardian);

						frame.setSize(790, 800);

						//Set variables to new values now
						gameRun = false;
						scene1 = false;
						npcStart = true;
						counter = 2;
					} 

					else 
					{
						// Player selected "NO" or closed the dialog then exit the program
						System.exit(0);
					}
				}
			}

			//Get the NPC and Player Masks
			npc1 = inter.getNPC1Mask();
			npc2 = inter.getNPC2Mask();
			npc3 = inter.getNPC3Mask();
			npc4 = inter.getNPC4Mask();
			playerMask = player.getMask();


			if (event == 3) 
			{				
				// Check if the player intersects with npc1 and npc1 is visible
				if (playerMask.intersects(npc1) && npc1show) 
				{
					//Question1's answer
					String fillBlankAns = "MINOTAUR";

					ImageIcon npc1Success = new ImageIcon("NPC/NPC1.png");

					while (true) 
					{
						// Prompt the user for an answer and store it in the fillBlankUserAns string
						String fillBlankUserAns = JOptionPane.showInputDialog(null,
								"What is this word (use the letters given as hints) " + "_ i _ _ t _ u _", "Trial #1!",
								JOptionPane.QUESTION_MESSAGE);

						// Check if the user's answer is correct regardless of if they typed it upper/lowercase (equalsIgnoreCase)
						if (fillBlankUserAns.equalsIgnoreCase(fillBlankAns)) 
						{
							// Display success message and update game variables
							JOptionPane.showMessageDialog(null,
									"You have passed the first trial " + name + "! \nBut be warned, the next trials"
											+ " will not come as easily demigod... ",
											"SUCCESSFUL COMPLETION", JOptionPane.PLAIN_MESSAGE, npc1Success);
							//Make the npc disappear after teh player answers the question correctly
							npc1show = false;
							npc2show = true;

							//reset movement release/pressed
							up = false;
							down = false;
							left = false;
							right = false;

							break;
						}

						else 
						{
							// Increment the wrong answer count
							wrongAnsCount1++;

							ImageIcon wrong = new ImageIcon("Wrong.png");
							ImageIcon timeDone = new ImageIcon("Hourglass.png");

							if (wrongAnsCount1 == 1)
							{
								// Display an incorrect answer message
								JOptionPane.showMessageDialog(null, "This is not the correct answer. Try again! ",
										"INCORRECT", JOptionPane.ERROR_MESSAGE, wrong);
							}

							else if (wrongAnsCount1 == 2) 
							{
								// Display a hint message for the second attempt and warn that they only have one chance left
								JOptionPane.showMessageDialog(null,
										"Hint the first letter is M. Beware you have one chance left ", "INCORRECT",
										JOptionPane.ERROR_MESSAGE, wrong);
							} 

							else if (wrongAnsCount1 == 3) 
							{
								// Display a failure message and exit the program
								JOptionPane.showMessageDialog(null, "It seems you have run out of time demigod...",
										"INCORRECT", JOptionPane.ERROR_MESSAGE, timeDone);

								System.exit(0);
							}
						}
					}
				}

				//Do the same as above with NPC2 but with different question, answer, and hints (everything else if the same otherwise)
				else if (playerMask.intersects(npc2) && npc2show) 
				{
					String question2Ans = "Athena";

					ImageIcon npc2Success = new ImageIcon("NPC/NPC2.png");

					while (true) 
					{
						String question2USERAns = JOptionPane.showInputDialog(null,
								"Which deity's olive branch brings peace, yet her spear ensures just war?", "Trial #2!",
								JOptionPane.QUESTION_MESSAGE);

						if (question2USERAns.equalsIgnoreCase(question2Ans)) 
						{
							JOptionPane.showMessageDialog(null,
									"You have passed the second trial " + name + "...\nBut be warned, the next 3 trials"
											+ " will not come as easily demigod... ",
											"SUCCESSFUL COMPLETION", JOptionPane.PLAIN_MESSAGE, npc2Success);
							npc2show = false;
							npc3show = true;

							up = false;
							down = false;
							left = false;
							right = false;

							break;
						}

						else 
						{
							wrongAnsCount2++;

							ImageIcon wrong = new ImageIcon("Wrong.png");
							ImageIcon timeDone = new ImageIcon("Hourglass.png");

							if (wrongAnsCount2 == 1)
							{
								JOptionPane.showMessageDialog(null, "This is not the correct answer. Try again! ",
										"INCORRECT", JOptionPane.ERROR_MESSAGE, wrong);
							}

							else if (wrongAnsCount2 == 2) 
							{
								JOptionPane.showMessageDialog(null,
										"Hint think of your quest giver. Beware you have one chance left ", "INCORRECT",
										JOptionPane.ERROR_MESSAGE, wrong);
							} 

							else if (wrongAnsCount2 == 3) 
							{
								JOptionPane.showMessageDialog(null, "It seems you have run out of time demigod...",
										"INCORRECT", JOptionPane.ERROR_MESSAGE, timeDone);
								System.exit(0);
							}
						}
					}
				}

				// Do the same as above with NPC3 but with different question, answer, and hints (everything else if the same otherwise)
				// Also uses regex to match the answers instead of equalsIgnoreCase since the answer is a number (not case sensitive)
				else if (playerMask.intersects(npc3) && npc3show) 
				{
					String question3Ans = string.getNewOutput();

					ImageIcon npc3Success = new ImageIcon("NPC/NPC3.png");

					while (true) 
					{
						String question3USERAns = JOptionPane.showInputDialog(null,
								"What is King Minos' wife in numbers?", JOptionPane.QUESTION_MESSAGE);

						if (question3USERAns.matches(question3Ans)) 
						{
							JOptionPane.showMessageDialog(null,
									"You have passed the third trial " + name + "! \nBut be warned, the next trial"
											+ " will not come as easily demigod... ",
											"SUCCESSFUL COMPLETION", JOptionPane.PLAIN_MESSAGE, npc3Success);
							npc3show = false;
							npc4show = true;

							up = false;
							down = false;
							left = false;
							right = false;

							break;
						}

						else 
						{
							wrongAnsCount3++;

							ImageIcon wrong = new ImageIcon("Wrong.png");
							ImageIcon timeDone = new ImageIcon("Hourglass.png");

							if (wrongAnsCount3 == 1)
							{
								JOptionPane.showMessageDialog(null, "This is not the correct answer. Try again! ",
										"INCORRECT", JOptionPane.ERROR_MESSAGE, wrong);
							}

							else if (wrongAnsCount3 == 2) 
							{
								JOptionPane.showMessageDialog(null,
										"Hint think of your telephone numbers. Beware you have one chance left ",
										"INCORRECT", JOptionPane.ERROR_MESSAGE, wrong);
							} 

							else if (wrongAnsCount3 == 3) 
							{
								JOptionPane.showMessageDialog(null, "It seems you have run out of time demigod...",
										"INCORRECT", JOptionPane.ERROR_MESSAGE, timeDone);
								System.exit(0);
							}
						}
					}
				}

				// Do the same as above with NPC4 but with different question, answer, and hints (everything else if the same otherwise)
				else if (playerMask.intersects(npc4) && npc4show) 
				{
					String question4Ans = "echo";

					ImageIcon npc4Success = new ImageIcon("NPC/NPC4.png");

					while (true) 
					{
						String question4USERAns = JOptionPane.showInputDialog(null,
								"I speak without a mouth, hear without ears. I have no body, but I come alive with the wind. What am I?",
								JOptionPane.QUESTION_MESSAGE);

						if (question4USERAns.equalsIgnoreCase(question4Ans)) 
						{
							JOptionPane.showMessageDialog(null, "You have passed the fourth and final trial " + name
									+ "! \nBut watch out there may be a surprise when retrieving the object you need... ",
									"SUCCESSFUL COMPLETION", JOptionPane.PLAIN_MESSAGE, npc4Success);
							npc4show = false;

							up = false;
							down = false;
							left = false;
							right = false;

							chestCounter++;

							break;
						}

						else 
						{
							wrongAnsCount4++;

							ImageIcon wrong = new ImageIcon("Wrong.png");
							ImageIcon timeDone = new ImageIcon("Hourglass.png");

							if (wrongAnsCount4 == 1)
							{
								JOptionPane.showMessageDialog(null, "This is not the correct answer. Try again! ",
										"INCORRECT", JOptionPane.ERROR_MESSAGE, wrong);
							}

							else if (wrongAnsCount4 == 2) 
							{
								JOptionPane.showMessageDialog(null,
										"Hint this is what you hear in caves. Beware you have one chance left ",
										"INCORRECT", JOptionPane.ERROR_MESSAGE, wrong);
							} 

							else if (wrongAnsCount4 == 3) 
							{
								JOptionPane.showMessageDialog(null, "It seems you have run out of time demigod...",
										"INCORRECT", JOptionPane.ERROR_MESSAGE, timeDone);
								System.exit(0);
							}
						}
					}

				}

				// Check if the player intersects with the chest and all NPCs are not visible
				else if (playerMask.intersects(inter.getChestMask()) && npc1show == false && npc2show == false && npc3show == false && npc4show == false) 
				{
					ImageIcon endMsg = new ImageIcon("NPC/OwlSprite.png");
					// Display a farewell message to the player and thank them
					JOptionPane.showMessageDialog(null, "Thank you for saving me " + name + "!! \nI can finally use my powers now that I'm free!\nI have a strong feeling we will meet again soon but till then...\nGoodbye brave demigod!!",
							"TRIALS FINISHED", JOptionPane.PLAIN_MESSAGE, endMsg);

					// Exit the program
					System.exit(0);
				}
			}
		}

		// Update the game display
		repaint();
	}

	public void paint(Graphics g) 
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;

		// Checks if the player is still alive (since the health is above 0)
		if (health > 0) 
		{
			if (titleInterface <= 2) 
			{
				// Display title screen + the instructions that continue after clicking the mouse
				titleScreen = new ImageIcon("Interfaces/TitleScreen"+titleInterface+".png");
				g2.drawImage(titleScreen.getImage(), 0, 0, this);

				// Set frame size and position
				frame.setSize(titleScreen.getIconWidth(), titleScreen.getIconHeight());
				frame.setLocationRelativeTo(null);
			}

			if (titleInterface == 3) 
			{
				// Start timers for player 
				playerTimer.start();

				// Update camera position based on player position
				camera.update(player.getX(), player.getY(), frame.getWidth(), frame.getHeight());

				// Display game scene (the first part which is the general courtyard area)
				gameScene = new ImageIcon("Interfaces/GameScene" + scene + ".png");
				g2.drawImage(gameScene.getImage(), -camera.getX(), -camera.getY(), this);
				frame.setSize(800, 800);
				frame.setLocationRelativeTo(null);

				// Draw the player character based on their positions and the camera
				g2.drawImage(player.getImage().getImage(), player.getX() - camera.getX(),
						player.getY() - camera.getY(), this);


				if (scene == 1 && scene1 == true) 
				{
					// Draw the player's hitbox that will tell if a snake hit them or not
					hit = new Rectangle2D.Double(player.getX() - camera.getX(), player.getY() - camera.getY(),
							player.getImage().getIconWidth(), player.getImage().getIconHeight());

					if (attack) 
					{
						// Draw the sword image when attacking
						g2.drawImage(swordImg.getImage(), player.getX() - camera.getX() + 37,
								player.getY() - camera.getY() + 15, this);
					}

					//Set the font, size, and draw the string "DEAD: " text and the amount of enemies the killed displayed below the player
					Font f = new Font("Arial", Font.BOLD, 11);
					g2.setFont(f);
					g2.drawString("DEAD: " + enemyKills, player.getX() - camera.getX(),
							player.getY() - camera.getY() + 75);

					//Cycle through the enemy array VIA a for loop
					for (int i = 0; i < enemy.length; i++) 
					{
						// Draw the enemy snakes in the array
						g2.drawImage(enemy[i].getImgs().getImage(), enemy[i].getX() - camera.getX(),
								enemy[i].getY() - camera.getY(), this);
					}
				}

				// Transition to the next scene
				else if (event == 2) 
				{
					scene1 = false;
					player.setY(490);
					player.setX(530);

					// Stop timers
					playerTimer.stop();
					kill.stop();
					reset.stop();

					if (gameRun == false) 
					{
						//Init new values
						health += 100;
						scene = 2;
						event = 3;
						gameRun = true;
						attack = false;
						scene1 = false;

						// Load new game scene (which is the maze)
						gameScene = new ImageIcon("Interfaces/GameScene" + scene + ".png");

						//Set player's initial coordinates when starting in the maze
						player.setY(690);
						player.setX(45);

						//Set all NPC flags to true so that they can be drawn in the maze scene and not anywhere else
						npcStart = true;
						npc1show = true;
						npc2show = true;
						npc3show = true;
						npc4show = true;

						//reset the key position so that the player doens't start automatically moving when in the new scene 
						up = false;
						down = false;
						left = false;
						right = false;

						//Restart the player timer
						playerTimer.start();

					}

				}

				//Draw the NPCs and the chests in the maze scene based on their coordinates
				else if (event == 3 && npcStart) 
				{
					//Draw the 4 NPCs in the maze at their respective coordinates
					if (npc1show)
						g2.drawImage(inter.getNPCIcon().getImage(), 45, 360, this);
					if (npc2show)
						g2.drawImage(inter.getNPCIcon2().getImage(), 360, 35, this);
					if (npc3show)
						g2.drawImage(inter.getNPCIcon3().getImage(), 715, 605, this);
					if (npc4show)
						g2.drawImage(inter.getNPCIcon4().getImage(), 350, 200, this);

					//Draw the chests open and close depending on if the requirements are met 
					if (chestCounter == 0)
						g2.drawImage(inter.getChestIcon().getImage(), 380, 400, this);
					if (npc1show == false && npc2show == false && npc3show == false && npc4show == false)
						g2.drawImage(inter.getOpenChestIcon().getImage(), 380, 400, this);
				}
			}

		}

		// IF the player health is not greater than 0 then the player has unfortunately lost therefore display the Lose Image
		else 
		{
			g2.drawImage(loseImg.getImage(), 0, 0, null);
			frame.setSize(loseImg.getIconWidth(), loseImg.getIconHeight());
			frame.setLocationRelativeTo(null);
		}
	} 

	private void titleChanger(MouseEvent e) {

		if (titleInterface == 0) 
		{
			// PLAY BUTTON: Checks if the mouse clicked is within the bounds of the play button
			if (e.getX() >= 100 && e.getX() <= 354 && e.getY() >= 590 && e.getY() >= 540) 
			{
				// Increment the titleInterface to proceed to the next interface/screen
				titleInterface++;
			}
			// EXIT BUTTON: Checks if the mouse clicked is within the bounds of the exit button
			else if (e.getX() >= 445 && e.getX() <= 699 && e.getY() >= 590 && e.getY() >= 540) 
			{
				//Exit the program
				System.exit(0);
			}
		} 
		else if (titleInterface == 1)
		{
			titleInterface++;
		}
		else if (titleInterface == 2)
		{
			titleInterface++;
		}

		else if (titleInterface == 3) 
		{
			//If the TitleInterface equals 3 then set scene1 flag to true, start playerTimer and set frame size
			scene1 = true;
			playerTimer.start();
			frame.setSize(800,800);
		}

		// Redraw the scene
		repaint();
	}


	public void mouseClicked(MouseEvent e) 
	{
		// Call the titleChanger method when the mouse is clicked
		titleChanger(e);
	}

	// CHECKS IF USER PRESSED THE KEYS
	public void keyPressed(KeyEvent e) 
	{
		if (e.getKeyCode() == KeyEvent.VK_A) 
		{
			// Set the 'left' flag to indicate left movement
			left = true;
		}

		else if (e.getKeyCode() == KeyEvent.VK_D) 
		{
			// Set the 'right' flag to indicate right movement
			right = true;
		}

		else if (e.getKeyCode() == KeyEvent.VK_W) 
		{
			// Set the 'up' flag to indicate up movement
			up = true;
		}

		else if (e.getKeyCode() == KeyEvent.VK_S) 
		{
			// Set the 'down' flag to indicate down movement
			down = true;
		}

		else if (e.getKeyCode() == KeyEvent.VK_SPACE) 
		{
			// Set the 'attack' flag to sword should be displayed to attack enemies
			attack = true;

			//Start reset timer
			reset.start();
		}
	}

	// CHECKS IF USER RELEASED THE KEY TO STOP PLAYER/WEAPON MOVEMENT
	public void keyReleased(KeyEvent e) 
	{
		if (e.getKeyCode() == KeyEvent.VK_A) 
		{
			// Reset the 'left' flag to indicate no left movement
			left = false;
		}

		else if (e.getKeyCode() == KeyEvent.VK_D) 
		{
			// Reset the 'right' flag to indicate no right movement
			right = false;
		}

		else if (e.getKeyCode() == KeyEvent.VK_W) 
		{
			// Reset the 'up' flag to indicate no up movement
			up = false;
		}

		else if (e.getKeyCode() == KeyEvent.VK_S) 
		{
			// Reset the 'down' flag to indicate no down movement
			down = false;
		} 

		else if (e.getKeyCode() == KeyEvent.VK_SPACE) 
		{
			// Reset the 'attack' flag to indicate no sword movement to kill enemies
			attack = false;
		}
	}

	private class Camera 
	{
		private int x, y, width, height;

		// Constructor for Camera class
		public Camera(int x, int y, int width, int height) 
		{
			// Initialize camera position and dimensions
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}

		// Method to update the camera position based on player position and frame dimensions
		public void update(int playerX, int playerY, int frameWidth, int frameHeight) 
		{
			// Calculate the new camera position based on the player position
			int newCameraX = playerX - frameWidth / 2;
			int newCameraY = playerY - frameHeight / 2;

			// ALL the code below makes sure the camera stays within the bounds of the game scene

			// Check if the new camera X position is less than 0 (outside left boundary)
			if (newCameraX < 0) 
			{
				// Set camera X to 0 to stay within the left boundary
				newCameraX = 0; 
			}
			// Check if the new camera X position is greater than the width of the game scene minus frame width (outside right boundary)
			else if (newCameraX > gameScene.getIconWidth() - frameWidth) 
			{
				// Set camera X to the maximum allowed value within the right boundary
				newCameraX = gameScene.getIconWidth() - frameWidth; 
			}

			// Check if the new camera Y position is less than 0 (outside top boundary)
			if (newCameraY < 0) 
			{
				// Set camera Y to 0 to stay within the top boundary
				newCameraY = 0; 
			}
			// Check if the new camera Y position is greater than the height of the game scene minus frame height (outside bottom boundary)
			else if (newCameraY > gameScene.getIconHeight() - frameHeight) 
			{
				// Set camera Y to the maximum allowed value within the bottom boundary
				newCameraY = gameScene.getIconHeight() - frameHeight; 
			}

			// Update the camera position
			x = newCameraX;
			y = newCameraY;
		}

		// Get method to retrieve the current camera X position
		public int getX() {
			return x;
		}

		// Get method to retrieve the current camera Y position
		public int getY() {
			return y;
		}
	}

	// Un-used methods
	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void keyTyped(KeyEvent e) {}
}