from nokia_menu import Menu
def main():
    items = [ "Messages", "Contacts", "Settings", "Games", "Extras"]
    menu = Menu(items)
    print("=== Nokia 3310 Menu Simulation ===")
    print(" Controls: 1: Up, 2: Down, enter= Select, 3: Back, 4: Exit\n")

    while True:
        print(f"\nCurrent:{menu.get_current_item()}")
        command = input("enter command ").lower().strip()
        if command == "1":
            menu.move_up()
        elif command == "2":
            menu.move_down()
        elif command == "3":
            menu.back()
        elif command == "4":
            menu.exit()
            break
        else:
            print("Invalid command")

if __name__ == "__main__":
    main()

