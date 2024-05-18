import * as React from 'react';

import { ExpoViewDeclarativeViewProps } from './ExpoViewDeclarative.types';

export default function ExpoViewDeclarativeView(props: ExpoViewDeclarativeViewProps) {
  return (
    <div>
      <span>{props.name}</span>
    </div>
  );
}
