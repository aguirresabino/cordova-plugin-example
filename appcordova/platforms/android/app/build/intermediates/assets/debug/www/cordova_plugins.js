cordova.define('cordova/plugin_list', function(require, exports, module) {
module.exports = [
  {
    "id": "helloPlugin.example.HelloPlugin",
    "file": "plugins/helloPlugin.example/www/HelloPlugin.js",
    "pluginId": "helloPlugin.example",
    "clobbers": [
      "cordova.plugins.HelloPlugin"
    ]
  }
];
module.exports.metadata = 
// TOP OF METADATA
{
  "cordova-plugin-whitelist": "1.3.3",
  "helloPlugin.example": "1.0.0"
};
// BOTTOM OF METADATA
});