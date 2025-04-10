import platform
import shutil
import os

# Check if source.txt exists before copying
if os.path.exists("source.txt"):
    shutil.copy("source.txt", "backup.txt")
    print("File copied")
else:
    print("source.txt not found")

# Check if destination directory exists before moving
if os.path.exists("backup.txt") and os.path.isdir("hello"):
    shutil.move("backup.txt", "hello/backup.txt")
    print("File moved")
else:
    print("Cannot move file - either backup.txt or hello/ directory doesn't exist")

# Remove directory safely
if os.path.isdir("hello"):
    shutil.rmtree("hello")
    print("Directory 'hello' removed")
else:
    print("Directory 'hello' not found")

# Get OS details
print("OS Name:", platform.system())
print("OS Version:", platform.version())

# Get processor details
print("Processor:", platform.processor())
