package view;

import java.util.List;
import java.util.Scanner;

import Controller.HomeController;
import DAO.HomeDAO;
import model.devices.AC;
import model.devices.Device;
import model.devices.Fan;
import model.devices.Light;
import model.devices.MusicPlayer;
import model.devices.Oven;
import model.devices.Shower;
import model.devices.TV;
import model.devices.WashingMachine;
import model.rooms.BedRoom;
import model.rooms.Corridor;
import model.rooms.DiningRoom;
import model.rooms.Kitchen;
import model.rooms.LivingRoom;
import model.rooms.Room;
import model.rooms.WashRoom;

public class HomeView 
{
	private Scanner scanner;
	private HomeDAO homeDAO;
	private HomeController homeController;
	
	//constructor
	public HomeView()
	{
		scanner = new Scanner(System.in);
		homeDAO = new HomeDAO();
		homeController = new HomeController(homeDAO);
	}
	
	// start method 
	public void start()
	{
		System.out.println("=====HOME AUTOMATION SYSTEM=====");
		
		int choice =1 ;
		
		while(choice !=0)
		{
			System.out.println("1. Add Room");
			System.out.println("2. Add Device");
			System.out.println("3. Remove Device");
			System.out.println("4. Turn ON Device");
			System.out.println("5. Turn OFF Device");
			System.out.println("6. Find Room By Name");
			System.out.println("7. Find Room By Id");
			System.out.println("8. Show All Rooms");
			System.out.println("9. Show All Status");
			System.out.println("0. Exit");
			
			System.out.println("Enter Your choice : ");
			choice = scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				// add room 
				Room room = createRoom();
				
				if(room !=  null)
				{
					boolean addRoomResult = homeController.addRoom(room);
					
					if(addRoomResult)
					{
						System.out.println("Room added successfully.");
					}
					else
					{
						System.out.println("Room could not be added.");
					}
				}
				
				break;
				
			case 2:
				
				//add device
				System.out.println("Enter room ID: ");
				int roomId= scanner.nextInt();
				
				Device device = createDevice();
				
				if(device != null)
				{
					boolean addDeviceResult= homeController.addDevice(roomId, device);
					
					if(addDeviceResult)
					{
						System.out.println("Device added successfully.");
					}
					else
					{
						System.out.println("Device colud not be added.");
					}
				}
				
				break;
				
				
			case 3:
				
				// remove device 
				
				System.out.println("Enter Room ID: ");
				int removeRoomId = scanner.nextInt();
				
				scanner.nextLine();
				
				System.out.println("Enter Device Name: ");
				String deviceName = scanner.nextLine();
				
				boolean removeDeviceResult = homeController.removeDevice(removeRoomId, deviceName);
				
				if(removeDeviceResult)
				{
					System.out.println("Device removed successfully");
				}
				else
				{
					System.out.println("Device could not be removed ");
				}
				
				break;
				
			
			case 4:
				// turn ON device 
				
				System.out.println("Enter Room ID: ");
				int onRoomId = scanner.nextInt();
				
				scanner.nextLine();
				
				System.out.println("Enter Device Name: ");
				String onDeviceName = scanner.nextLine();
				
				boolean turnOnResult = homeController.turnOnDevice(onRoomId, onDeviceName);
				
				if(turnOnResult)
				{
					System.out.println("Device turn ON successfully");
				}
				else
				{
					System.out.println("Device could not be turn ON");
				}
				
				break;
				
			case 5:
				//turn OFF device 
				
				System.out.println("Enter Room ID: ");
				int offRoomId = scanner.nextInt();
				
				scanner.nextLine();
				
				System.out.println("Enter Device Name: ");
				String offDeviceName = scanner.nextLine();
				
				boolean turnOffResult = homeController.turnOffDevice(offRoomId, offDeviceName);
				
				if(turnOffResult)
				{
					System.out.println("Device turn OFF Successfully");
				}
				else
				{
					System.out.println("Device could not be turn OFF");
				}
				
				break;
				
			case 6:
				// find room by name 
				scanner.nextLine();
				
				System.out.println("Enter Room Name: ");
				String roomName = scanner.nextLine();
				
				Room foundRoom = homeController.getRoomByName(roomName);
				
				if(foundRoom != null)
				{
					System.out.println("Room Found : ");
					System.out.println("Room ID : "+foundRoom.getRoomId());
					System.out.println("Room Name :"+foundRoom.getRoomName());
				}
				else
				{
					System.out.println("Room not found");
				}
				
				break;
				
			case 7:
				//find room by id 
				
				System.out.println("Enter Room ID: ");
				int roomid = scanner.nextInt();
				
				Room foundId = homeController.getRoomById(roomid);
				
				if(foundId != null)
				{
					System.out.println("RoomID found :");
					System.out.println("Room ID: "+foundId.getRoomId());
					System.out.println("Room Name :"+foundId.getRoomName());
				}
				else
				{
					System.out.println("Room not found");
				}
				
				break;
				
			case 8:
				//show all rooms 
				
				List<Room> rooms = homeController.getAllRooms();
				
				if(rooms.isEmpty())
				{
					System.out.println("No rooms found");
				}
				else
				{
					System.out.println("===== ALL ROOMS =====");
					
					for(Room r : rooms)
					{
						System.out.println("Room ID: " + r.getRoomId());
			            System.out.println("Room Name: " + r.getRoomName());
			            System.out.println("--------------------");
					}
				}
				
				break;
				
			case 9:
				//show all status 
				
				homeController.showAllStatus();
				break;
				
				
			case 0:
			
			    System.out.println("Exiting ..");
			    break;
			    
			  default:
				  
				System.out.println("Invalid choice");
				break;
			}
		}
		
		
		
	}
	
	// create room 
	
	private Room createRoom()
	{
		System.out.println("\nSelect Room Type: ");
		System.out.println("1. Bedroom");
		System.out.println("2. Living Room");
		System.out.println("3. Kitchen");
		System.out.println("4. Dining Room");
		System.out.println("5. Corridor");
		System.out.println("6. Wash Room");
		
		System.out.println("Enter Room Type :");
		int roomType = scanner.nextInt();
		
		System.out.println("Enter Room ID:");
		int roomId = scanner.nextInt();
		
		scanner.nextLine();
		
		
		System.out.println("Enter Room Name: ");
		String roomName =  scanner.nextLine();
		
		switch(roomType)
		{
		case 1:
			return new BedRoom(roomId , roomName);
			
		case 2: 
			return new LivingRoom(roomId , roomName);
		
		case 3:
			return new Kitchen(roomId , roomName);
			
		case 4:
			return new DiningRoom(roomId , roomName);
		
		case 5:
			return new Corridor(roomId , roomName);
			
		case 6:
			return new WashRoom(roomId , roomName);
			
		default:
			System.out.println("Invalid room type.");
			return null;
			
		}
		
		
	}
	
	
	// add device 
	
	private Device createDevice()
	{
		System.out.println("\nSelect Device Type: ");
		System.out.println("1. Fan");
		System.out.println("2. AC");
		System.out.println("3. Light");
	    System.out.println("4. Music Player");
	    System.out.println("5. Oven");
	    System.out.println("6. Shower");
	    System.out.println("7. TV");
	    System.out.println("8. Washing Machine");
	    
	    System.out.println("Enter Device type: ");
	    int deviceType = scanner.nextInt();
	    
	    System.out.println("Enter Device ID: ");
	    int deviceId = scanner.nextInt();
	    
	    switch(deviceType)
	    {
	    
	    case 1:
	    	return new Fan(deviceId);
	    	
	    case 2:
	    	return new AC(deviceId);
	    
	    case 3:
	    	return new Light(deviceId);
	    	
	    case 4:
	    	return new MusicPlayer(deviceId);
	    	
	    case 5:
	    	return new Oven(deviceId);
	    
	    case 6:
	    	return new Shower(deviceId);
	    	
	    case 7:
	    	return new TV(deviceId);
	    	
	    case 8:
	    	return new WashingMachine(deviceId);
	    	
	    default:
	    	System.out.println("Invalid device type: ");
	    	return null;
	    }
	}
	
	

}
