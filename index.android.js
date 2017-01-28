import { AppRegistry, StatusBar } from 'react-native';

import App from './refs/geolocation';

// http://stackoverflow.com/questions/29408492/is-it-possible-to-combine-react-native-with-socket-io
if (!window.navigator.userAgent) {
  window.navigator.userAgent = "Pointlook";
}

// http://stackoverflow.com/questions/37311759/error-when-running-firebase-3-0-with-react-native
//
global.location = { href: '' };
global.screen = {};
global.document = { getElementsByTagName: function(){} };
global.parent = global;
//

// Ensure that there is a global Buffer shareable to all childs
global.Buffer = global.Buffer || require('buffer/').Buffer;

console.disableYellowBox = true;
StatusBar.setHidden(true);

AppRegistry.registerComponent('Pointlook', () => App);
