# Open a file in write mode (creates the file if it doesn't exist)
file = open("example.txt", "w")
# Write to the file
file.write("Hello, Infant!\n")
file.write("This is a text file.\n")
# Close the file
file.close()
# Open the file in append mode
file = open("example.txt", "a")
# Append to the file
file.write("Appending a new line.\n")
# Close the file
file.close()
# Open the file in read mode
file = open("example.txt", "r")
# Read the contents of the file
content = file.read()
print("File content after writing and appending:")
print(content)
# Get the current file position using tell()
position = file.tell()
print(f"Current file position: {position}")
# Close the file
file.close()