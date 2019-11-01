# Pixelator
Pixelator is a very simple and easy to use Spigot plugin to convert all your .PNG files into Minecraft pixel arts. Pixel art is basically a group of blocks (representing pixels) that form a picture like this one:

![alt text](https://i.ytimg.com/vi/fSrxqtw0si8/maxresdefault.jpg)

Since this plugin takes in an image and converts it into Minecraft blocks, you can not expect the result to be in any other shape than a rectangle or square. The installation process and usage is explained below.

## Installation process:

To install Pixelator you firstly need a Spigot server (version 1.14.4) and Java 11. There are quite a few tutorials on the Internet on how to create a server. Once you create one, follow these steps:
- head to the repository's [releases](https://github.com/EncryptedShoesHD/Pixelator/releases),
- from there download files named `Pixel8or.jar` and `textures.zip`,
- place `Pixel8or.jar` into your plugins folder, which is located on your server,
- start the server and wait for the plugin to generate necessary directories,
- unzip `textures.zip` into the `plugins/Pixel8or/textures` folder,
- reload the server

## Image conversion process:

To convert an image to Minecraft pixel art, follow these steps:
- make sure your file has a .PNG ending (.JPEG is coming soon),
- make sure your image is big/small enough, since one Minecraft block will represent one pixel of an image,
- place your image into the `plugins/Pixel8or/input` folder
- join the server and execute the following command:
     - `/pixelator [your_file_name_excluding_extension]` for example `/pixelator selfie`
     
## TO-DO:

- [X] Convert pictures into pixel arts,
- [X] Handle custom texture packs,
- [ ] Allow users to specify the pixel to blocks ratio (basically resizing),
- [ ] Allow .JPEG images,
- [ ] Allow users to specify image URLs instead of local files,
- [ ] Allow users to use various filters and effects (grayscale, sharpening...) before conversion
- [ ] Allow users to select blocks from which the pixel art should be formed,
